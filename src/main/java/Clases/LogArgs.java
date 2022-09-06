package Clases;

public class LogArgs {
    private String _tipo_nivel = "";
    private String _estatus = "";

    public LogArgs(String _tipo_nivel, String _estatus) {
        this._tipo_nivel = _tipo_nivel;
        this._estatus = _estatus;
    }

    public String get_tipo_nivel() {
        return _tipo_nivel;
    }

    public void set_tipo_nivel(String _tipo_nivel) {
        this._tipo_nivel = _tipo_nivel;
    }

    public String get_estatus() {
        return _estatus;
    }

    public void set_estatus(String _estatus) {
        this._estatus = _estatus;
    }
}
