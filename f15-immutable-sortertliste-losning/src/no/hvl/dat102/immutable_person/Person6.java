package no.hvl.dat102.immutable_person;

import java.util.Objects;

public final class Person6 {

	private final Navn navn;
	private final int fodselsaar;
	
	public Person6(Navn navn, int fodselsaar) {
		this.navn = new Navn(navn.getFornavn(), navn.getEtternavn());
		this.fodselsaar = fodselsaar;
	}
	
	public Navn getNavn() {
		return new Navn(navn.getFornavn(), navn.getEtternavn());
	}

	public int getFodselsaar() {
		return fodselsaar;
	}

	@Override
	public String toString() {
		return "Person0 [navn=" + navn + ", fodselsaar=" + fodselsaar + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fodselsaar, navn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person6 other = (Person6) obj;
		return fodselsaar == other.fodselsaar && Objects.equals(navn, other.navn);
	}
}
