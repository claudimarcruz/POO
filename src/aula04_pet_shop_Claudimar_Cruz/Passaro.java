package aula04_pet_shop_Claudimar_Cruz;

public class Passaro extends Animal {
	private Integer num_anilha;
	
	
	public Passaro() {
		super();
	}


	public Passaro(Integer id, String nome, Integer idade, String raca, String cor, String sexo, Integer num_anilha) {
		super(id, nome, idade, raca, cor, sexo);
		this.num_anilha = num_anilha;
	}


	public Integer getNum_anilha() {
		return num_anilha;
	}


	public void setNum_anilha(Integer num_anilha) {
		this.num_anilha = num_anilha;
	}
	
	
	
	
}
