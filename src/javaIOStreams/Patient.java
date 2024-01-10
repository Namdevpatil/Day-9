package javaIOStreams;

import java.io.Serializable;

//Serialization
public class Patient implements Serializable
{
	
	private int patientId;
	transient private String patientName;
	private String patientProblem;
	private String patientAddress; 
	
	public Patient() {
		// TODO Auto-generated constructor stub
	}

	public Patient(int patientId, String patientName, String patientProblem, String patientAddress) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientProblem = patientProblem;
		this.patientAddress = patientAddress;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientProblem=" + patientProblem
				+ ", patientAddress=" + patientAddress + "]";
	}
	
	
}
