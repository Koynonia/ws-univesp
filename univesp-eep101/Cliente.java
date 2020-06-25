import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

    private String cpf;
    private String nome;
    private String telefone;
    private Date dtNasc;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {

        Format formato = new SimpleDateFormat("dd/MM/yyyy");
        formato = new SimpleDateFormat("dd/MM/yyyy");

        return "Cliente [ CPF = " + getCpf() 
        + ", Data de Nascimento = " + formato.format(getDtNasc()) 
        + ", Nome = " + getNome() 
        + ", Telefone = " + getTelefone() + " ]";
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date data;
            data = formato.parse("23/11/2015");

            Cliente cli = new Cliente();

            cli.cpf = "111.222.333-44";
            cli.dtNasc = data;
            cli.nome = "Jose Silva";
            cli.telefone = "(11) 5555-6666";

            System.out.println(cli.toString());

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
