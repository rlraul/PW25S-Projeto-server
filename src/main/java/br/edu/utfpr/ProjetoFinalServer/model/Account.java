package br.edu.utfpr.ProjetoFinalServer.model;

import br.edu.utfpr.ProjetoFinalServer.enumerator.TypeAccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @NotNull
    private String Agency;

    @NotNull
    private String bank;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;

    @OneToOne
    private User user;

}
