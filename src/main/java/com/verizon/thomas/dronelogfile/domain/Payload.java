package com.verizon.thomas.dronelogfile.domain;

import java.io.Serializable;

public class Payload implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Camera CameraObject;
	 Gimbal GimbalObject;


	 // Getter Methods 

	 public Camera getCamera() {
	  return CameraObject;
	 }

	 public Gimbal getGimbal() {
	  return GimbalObject;
	 }

	 // Setter Methods 

	 public void setCamera(Camera cameraObject) {
	  this.CameraObject = cameraObject;
	 }

	 public void setGimbal(Gimbal gimbalObject) {
	  this.GimbalObject = gimbalObject;
	 }
	}
