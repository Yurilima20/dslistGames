package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// classe auxilar, pois essa classe é formada por dois ids, e será instanciada pela
// composição dos mesmos, tornando um id. 

@Embeddable // fala que o id unico na Belonging é composta por dois id's, encapsulando dois id's em um só.
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "game_id") //chave estrangeira
	private Game game; 
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	} 
	
	// como é uma classe auxiliar os dois id's são levados em conta. 
	
}
