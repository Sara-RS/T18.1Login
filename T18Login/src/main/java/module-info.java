module com.mycompany.t18login {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t18login to javafx.fxml;
    exports com.mycompany.t18login;
}
