public class Aluno {
    private String nome;
    private int id;
<<<<<<< HEAD

    public Aluno(String Nome, int Id){
        nome = Nome;
        id = Id;
    }

=======
	
    public Aluno(int id, String nome){
        this.nome = nome;
        this.id = id;
    }
	
>>>>>>> 56d39169a9c192afd301aad27ad20b12dc28d645
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