package ClassesMetodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 27;
        d1.mes = 9;
        d1.ano = 2000;
        System.out.println(d1.dataFormatada());
    }
}
