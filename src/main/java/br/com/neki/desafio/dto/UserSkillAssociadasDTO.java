package br.com.neki.desafio.dto;

import java.time.LocalDate;

public interface UserSkillAssociadasDTO {
	
	Integer getIdUsuarioHabilidade();
	Integer getNivelHabilidadeUsuario();
	LocalDate getDataCriacao();
	LocalDate getDataAtualizacao();
	String getLoginUsuario();
	String getNomeHabilidade();

}
