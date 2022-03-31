## CRUD utilizando conceitos de JPA + Hibernate + MySQL



**Clone o repositório** 
```
git clone https://github.com/alexjosesilva/aplicacao_jpa
```
## Requirements

1. Java - 1.8.x
2. Maven - 3.x.x
3. Mysql - 5.x.x
4. Hibernate e Mysql estão no repositório não precisa buscar outra fonte

## BD
5) criar o banco de dados crudjpa
6) Alterar o user e passord no arquivo persistence.xml
7) criar o BD no mysql

```
CREATE DATABASE crudjpa;
```

## Run aplicacao executar o Aplicacao.java

8) Run -> Java Aplication
```markdown
public class Aplicacao {

	public static void main(String[] args) {
		
		//salvar
		Carro carro1 = new Carro();	
		carro1.setNome("Ferrari");
		
		Carro carro2 = new Carro();	
		carro2.setNome("BMW");
		
		Carro carro3 = new Carro();	
		carro3.setNome("Camaro");
		
		CarroController car = new CarroController();
		
		//salvar
		car.salvar(carro1);
		car.salvar(carro2);
		car.salvar(carro3);
		
		//remover
		car.remover(carro1);
		
		
		//Listar
		List<Carro> carros = car.listar();
		for (int i = 0; i < carros.size() ; i++) {
			System.out.print(" Nome: "+ carros.get(i).getNome());
		}
		
		//atualizar
		car.update(carro2,"Posh",118);
		
	}

}

```
## License
MIT © [Alex Jose](https://github.com/alexjosesilva)

## Linkedin 
[Alex Jose (https://www.linkedin.com/in/alexjosesilva/)
