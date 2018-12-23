package sample;

import java.sql.*;


public class DatabaseHendler extends Configs {

    Connection dbConnection;
    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
        String connectionString= "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" +dbName; // связываемся с базой данных

        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }
    public void signUpUser( User user)
    {
        String insert = " INSERT INTO " + Constants.USER_TABLE + "(" +
                Constants.USERS_FIRSTNAME + "," + Constants.USERS_LASTNAME + "," +
                Constants.USERS_USERNAME + "," + Constants.USERS_PASSWORD + "," +
                Constants.USERS_LOCATION + "," + Constants.USERS_GROUP + ") " +
                "VALUES(?,?,?,?,?,?)";//SQL запрос
        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
            prSt.setString(1, user.getFirstName());
            prSt.setString(2, user.getPassword());
            prSt.setString(3, user.getLastName());
            prSt.setString(4, user.getUserName());
            prSt.setString(5, user.getLocation());
            prSt.setString(6, user.getGroup());

            prSt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getStackTrace());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getUser (User user){
        ResultSet resSet = null;

        String select = "SELECT * FROM " + Constants.USER_TABLE + " WHERE " +
                Constants.USERS_USERNAME + "=? AND " + Constants.USERS_PASSWORD + "=?"; //Выбрать все из бызы данных таблички юзер. Это очередной SQL запрос для вызова логина и пароля

        try {
            PreparedStatement prSt = getDbConnection().prepareStatement(select);
            prSt.setString(1, user.getUserName());
            prSt.setString(2, user.getPassword());

            resSet = prSt.executeQuery();// Получить
        }
        catch (SQLException e)
        {
            System.out.println(e.getStackTrace());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  resSet;
    }

}
