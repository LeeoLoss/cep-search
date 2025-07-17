module buscador {
    requires java.net.http;
    requires com.google.gson;

    exports com.leonardoloss.cepsearch;
    opens com.leonardoloss.cepsearch to com.google.gson;
}
