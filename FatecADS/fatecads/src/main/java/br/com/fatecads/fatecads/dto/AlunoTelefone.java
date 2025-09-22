package br.com.fatecads.fatecads.dto;

public class AlunoTelefone {
    
    private String nomeAluno;
    private String telAluno;

    public AlunoTelefone(String nomeAluno, String telAluno) {
        this.nomeAluno = nomeAluno;
        this.telAluno = telAluno;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getTelAluno() {
        return telAluno;
    }
}
