package com.gestioncomptes.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V") // V = Versement
public class Versement extends Operation implements Serializable {

}
