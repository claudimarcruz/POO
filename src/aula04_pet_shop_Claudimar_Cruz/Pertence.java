package aula04_pet_shop_Claudimar_Cruz;

public class Pertence {
	private Integer id;
	private String CPF_dono;
	private Integer id_animal;
	
	public Pertence() {
		super();
	}

	public Pertence(Integer id, String cPF_dono, Integer id_animal) {
		super();
		this.id = id;
		CPF_dono = cPF_dono;
		this.id_animal = id_animal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCPF_dono() {
		return CPF_dono;
	}

	public void setCPF_dono(String cPF_dono) {
		CPF_dono = cPF_dono;
	}

	public Integer getId_animal() {
		return id_animal;
	}

	public void setId_animal(Integer id_animal) {
		this.id_animal = id_animal;
	}
	
	
	
	
}
