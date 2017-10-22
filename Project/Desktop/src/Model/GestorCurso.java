/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorCurso {
    String conexion = "jdbc:sqlserver://localhost:1412;databaseName=Colegio_Informatica_Metodologia";
    String user = "Gabriel";
    String pass = "1234";
    
    public void agregar(Curso c) throws SQLException, ClassNotFoundException{
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(conexion,user,pass);
        PreparedStatement comando = con.prepareStatement("exec sp_insert_curso ?,?,?,?,?,?,?,?,?,?");
        comando.setString(1, c.getNombreCurso());
        comando.setString(2, c.getDescripcion()); 
        comando.setString(3,c.getFechaInicio());
        comando.setString(4, c.getTemas());
        comando.setInt(5, c.getDuracionTotalSemanas());
        comando.setDouble(6,c.getCosto());
        comando.setInt(7, c.getCupo());
        comando.setString(8, c.getAula());
        comando.setString(9, c.getDiaHorario());
        comando.setInt(10, c.getCargaHoraria());
        
        comando.executeUpdate();
        comando.close();
        con.close();
    }
    
    public void modificar(Curso c) throws SQLException, ClassNotFoundException{
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(conexion, user,pass);
        PreparedStatement comando = con.prepareStatement("exec sp_update_curso_largo ?,?,?,?,?,?,?,?,?,?,?");
        comando.setInt(1, c.getIdCurso());
        comando.setString(2, c.getNombreCurso());
        comando.setString(3, c.getDescripcion()); 
        comando.setString(4,c.getFechaInicio());
        comando.setString(5, c.getTemas());
        comando.setInt (6, c.getDuracionTotalSemanas());
        comando.setDouble(7, c.getCosto());
        comando.setInt(8, c.getCupo());
        comando.setString(9, c.getAula());
        comando.setString(10, c.getDiaHorario());
        comando.setInt(11, c.getCargaHoraria());
        comando.executeUpdate();
        comando.close();
        con.close();
    }
    
    public ArrayList<Curso> TodosCursos() throws SQLException, ClassNotFoundException{
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        Connection con = DriverManager.getConnection(conexion, user,pass);
        Statement comando = con.createStatement();
        ResultSet query = comando.executeQuery("select * from Cursos");
        while(query.next()){
            Curso c = new Curso();
            
            c.setIdCurso(query.getInt("id_curso"));
            c.setNombreCurso(query.getString("nombre"));
            c.setDescripcion(query.getString("descripcion"));
            c.setFechaInicio(query.getString("fecha_inicio"));
            c.setTemas(query.getString("temas"));
            c.setDuracionTotalSemanas(query.getInt("duracion_total_semanas"));
            c.setCosto(query.getDouble("costo"));
            c.setCupo(query.getInt("cupo"));
            c.setAula(query.getString("aula"));
            c.setDiaHorario(query.getString("dia_horario"));
            c.setCargaHoraria(query.getInt("carga_horaria"));
            cursos.add(c);
        }
        query.close();
        comando.close();
        con.close();
        return cursos;
    }
    
    public Curso obtenerCurso(int i) throws ClassNotFoundException, SQLException{
        Curso c = new Curso();
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con  = DriverManager.getConnection(conexion,user,pass);
        Statement comando = con.createStatement();
        ResultSet query = comando.executeQuery("select * from Cursos where id_curso ="+ i);
        if(query.next()){
            c.setNombreCurso(query.getString("nombre"));
            c.setDescripcion(query.getString("descripcion"));
            c.setTemas(query.getString("temas"));
            c.setFechaInicio(query.getString("fecha_inicio"));
            c.setDuracionTotalSemanas(query.getInt("duracion_total_semanas"));
            c.setCupo(query.getInt("cupo"));
            c.setCosto(query.getInt("costo"));
            c.setAula(query.getString("aula"));
            c.setDiaHorario(query.getString("dia_horario"));
            c.setCargaHoraria(query.getInt("carga_horaria"));
        }
        query.close();
        comando.close();
        con.close();
        return c;
    }
    
    public ArrayList<Curso> proximosCursos() throws SQLException, ClassNotFoundException {
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        Connection con = DriverManager.getConnection(conexion, user, pass);
        Statement comando = con.createStatement();
        ResultSet query = comando.executeQuery("exec vw_consultar_cursos_proximos");
        while (query.next()) {
            Curso c = new Curso();

            c.setIdCurso(query.getInt("Id"));
            c.setNombreCurso(query.getString("Curso"));
            c.setDescripcion(query.getString("Descripcion"));
            c.setFechaInicio(query.getString("Inicio"));
            c.setTemas(query.getString("Temas"));
            c.setDuracionTotalSemanas(query.getInt("Cantidad de semana"));
            c.setCosto(query.getDouble("Costo"));
            c.setCupo(query.getInt("cupo"));
            c.setAula(query.getString("aula"));
            c.setDiaHorario(query.getString("Dia + Horario"));
            c.setCargaHoraria(query.getInt("Carga horaria por dia"));
            cursos.add(c);
        }
        query.close();
        comando.close();
        con.close();
        return cursos;
    }

    public ArrayList<ComboCurso> ComboCursosActuales() throws SQLException, ClassNotFoundException {
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ArrayList<ComboCurso> cursos = new ArrayList<ComboCurso>();
        Connection con = DriverManager.getConnection(conexion, user, pass);
        Statement comando = con.createStatement();
        ResultSet query = comando.executeQuery("exec vw_cursos_actuales_combo");
        while (query.next()) {
            ComboCurso c = new ComboCurso();
            c.setId(query.getInt("Id"));
            c.setNombre(query.getString("Curso"));
            cursos.add(c);
        }
        query.close();
        comando.close();
        con.close();
        return cursos;
    }

    public ArrayList<ComboNuevoCursante> ComboCursosIncribir() throws SQLException, ClassNotFoundException {
        forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        ArrayList<ComboNuevoCursante> cursos = new ArrayList<ComboNuevoCursante>();
        Connection con = DriverManager.getConnection(conexion, user, pass);
        Statement comando = con.createStatement();
        ResultSet query = comando.executeQuery("exec vw_curso_proximo_combo");
        while (query.next()) {
            ComboNuevoCursante c = new ComboNuevoCursante();

            c.setId(query.getInt("Id"));
            c.setNombre(query.getString("Curso"));
            c.setFecha(query.getString("Fecha de Inicio"));
            cursos.add(c);
        }
        query.close();
        comando.close();
        con.close();
        return cursos;
    }
}