module lk.ijse.gdse.supermarket {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires java.sql;
    requires com.jfoenix;
    requires net.sf.jasperreports.core;
    requires java.mail;
    requires mysql.connector.j;
    requires org.apache.commons.logging;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires java.naming;

    opens lk.ijse.gdse.supermarket.dto.tm to javafx.base;
    opens lk.ijse.gdse.supermarket.controller to javafx.fxml;
    opens lk.ijse.gdse.supermarket.entity to org.hibernate.orm.core; //entity tik coonnect kala
    exports lk.ijse.gdse.supermarket;
}