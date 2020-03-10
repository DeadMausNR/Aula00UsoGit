public class Aluno {
    private String nome;
    private int id;
	
    public Aluno(int id, String nome){
        this.nome = nome;
        this.id = id;
    }
	
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }
	
    public String getNome(){
        return nome;
    }
	
    public int getId(){
        return id;
    }
    
}