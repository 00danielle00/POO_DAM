package dificultades_enum;

public enum dificultades_Enum {
    FACIL(2),MEDIO(4),DIFICIL(8),EXPERTO(10);

    private int multiplicador;

    dificultades_Enum(int multiplicador){
        this.multiplicador=multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }
}
