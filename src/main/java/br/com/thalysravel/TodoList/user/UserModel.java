package br.com.thalysravel.TodoList.user;

import lombok.Data;

@Data //Coloca os Getters(@Getter) e Setter(@Setter) automaticamente
public class UserModel {

    //@Getter e @Setter podem ser colocados em cima dos atributos tbm
    private String username;
    private String name;
    private Double password;
}
