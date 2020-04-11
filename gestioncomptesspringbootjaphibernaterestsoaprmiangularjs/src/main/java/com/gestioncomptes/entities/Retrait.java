package com.gestioncomptes.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R") // R = Retrait

public class Retrait extends Operation implements Serializable {

}
