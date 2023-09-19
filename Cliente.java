import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    public String nome;
    public String CPF;
    public String RG;
    public Date nascimento;
    Date data = new Date();
    public String dataAtual = new SimpleDateFormat("yyyyMMdd").format(data);
    public int dataFormatada = Integer.parseInt((String.valueOf(dataAtual.charAt(0)))+(String.valueOf(dataAtual.charAt(1))) +(String.valueOf(dataAtual.charAt(2))) +(String.valueOf(dataAtual.charAt(3))));
    public boolean flag = false;
    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }
    public Cliente(Cliente cliente) {
    }

    void setNascimento(int dia, int mes, int ano) throws ParseException {
        this.nascimento = new Date(dia, mes, ano);
        if(this.dataFormatada - ano >= 18){
            this.flag = true;
        }
    }
    String getNascimento(){
            System.out.println( this.nascimento);
            return "";
    }
    void getData(){
            System.out.println(this.dataFormatada);
    }
}