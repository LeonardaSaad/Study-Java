package com.projectsimpledemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Carregar o arquivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load(); // Carrega o FXML como root

        // Criar a cena com o root carregado do FXML
        Scene scene = new Scene(root, 800, 600);

        // Adicionar o CSS à cena (assumindo que o arquivo está no mesmo diretório)
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());

        // Configurar e exibir a janela
        stage.setTitle("Morse conversor");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
