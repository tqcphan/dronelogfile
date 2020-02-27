//package com.verizon.thomas.dronelogfile.domain;
//
//
//public class LogFilePoJo {
//	 private String exchange_type;
//	 private String exchanger;
//	 private String uploadingOrgUuid = null;
//	 private String uploadingPilotUuid;
//	 private String flight_session_id;
//	 Message MessageObject;
//
//
//	 // Getter Methods 
//
//	 public String getExchange_type() {
//	  return exchange_type;
//	 }
//
//	 public String getExchanger() {
//	  return exchanger;
//	 }
//
//	 public String getUploadingOrgUuid() {
//	  return uploadingOrgUuid;
//	 }
//
//	 public String getUploadingPilotUuid() {
//	  return uploadingPilotUuid;
//	 }
//
//	 public String getFlight_session_id() {
//	  return flight_session_id;
//	 }
//
//	 public Message getMessage() {
//	  return MessageObject;
//	 }
//
//	 // Setter Methods 
//
//	 public void setExchange_type(String exchange_type) {
//	  this.exchange_type = exchange_type;
//	 }
//
//	 public void setExchanger(String exchanger) {
//	  this.exchanger = exchanger;
//	 }
//
//	 public void setUploadingOrgUuid(String uploadingOrgUuid) {
//	  this.uploadingOrgUuid = uploadingOrgUuid;
//	 }
//
//	 public void setUploadingPilotUuid(String uploadingPilotUuid) {
//	  this.uploadingPilotUuid = uploadingPilotUuid;
//	 }
//
//	 public void setFlight_session_id(String flight_session_id) {
//	  this.flight_session_id = flight_session_id;
//	 }
//
//	 public void setMessage(Message messageObject) {
//	  this.MessageObject = messageObject;
//	 }
//	}
//	public class Message {
//	 File FileObject;
//	 private String message_type;
//	 Flight_logging Flight_loggingObject;
//	 Flight_data Flight_dataObject;
//
//
//	 // Getter Methods 
//
//	 public File getFile() {
//	  return FileObject;
//	 }
//
//	 public String getMessage_type() {
//	  return message_type;
//	 }
//
//	 public Flight_logging getFlight_logging() {
//	  return Flight_loggingObject;
//	 }
//
//	 public Flight_data getFlight_data() {
//	  return Flight_dataObject;
//	 }
//
//	 // Setter Methods 
//
//	 public void setFile(File fileObject) {
//	  this.FileObject = fileObject;
//	 }
//
//	 public void setMessage_type(String message_type) {
//	  this.message_type = message_type;
//	 }
//
//	 public void setFlight_logging(Flight_logging flight_loggingObject) {
//	  this.Flight_loggingObject = flight_loggingObject;
//	 }
//
//	 public void setFlight_data(Flight_data flight_dataObject) {
//	  this.Flight_dataObject = flight_dataObject;
//	 }
//	}
//	public class Flight_data {
//	 Payload PayloadObject;
//	 Remote_controller Remote_controllerObject;
//	 Aircraft AircraftObject;
//	 Summary SummaryObject;
//	 Gcs GcsObject;
//	 private String flight_session_end;
//	 Flight_controller Flight_controllerObject;
//	 Battery BatteryObject;
//	 private String flight_session_start;
//	 Logfile_device_origin Logfile_device_originObject;
//
//
//	 // Getter Methods 
//
//	 public Payload getPayload() {
//	  return PayloadObject;
//	 }
//
//	 public Remote_controller getRemote_controller() {
//	  return Remote_controllerObject;
//	 }
//
//	 public Aircraft getAircraft() {
//	  return AircraftObject;
//	 }
//
//	 public Summary getSummary() {
//	  return SummaryObject;
//	 }
//
//	 public Gcs getGcs() {
//	  return GcsObject;
//	 }
//
//	 public String getFlight_session_end() {
//	  return flight_session_end;
//	 }
//
//	 public Flight_controller getFlight_controller() {
//	  return Flight_controllerObject;
//	 }
//
//	 public Battery getBattery() {
//	  return BatteryObject;
//	 }
//
//	 public String getFlight_session_start() {
//	  return flight_session_start;
//	 }
//
//	 public Logfile_device_origin getLogfile_device_origin() {
//	  return Logfile_device_originObject;
//	 }
//
//	 // Setter Methods 
//
//	 public void setPayload(Payload payloadObject) {
//	  this.PayloadObject = payloadObject;
//	 }
//
//	 public void setRemote_controller(Remote_controller remote_controllerObject) {
//	  this.Remote_controllerObject = remote_controllerObject;
//	 }
//
//	 public void setAircraft(Aircraft aircraftObject) {
//	  this.AircraftObject = aircraftObject;
//	 }
//
//	 public void setSummary(Summary summaryObject) {
//	  this.SummaryObject = summaryObject;
//	 }
//
//	 public void setGcs(Gcs gcsObject) {
//	  this.GcsObject = gcsObject;
//	 }
//
//	 public void setFlight_session_end(String flight_session_end) {
//	  this.flight_session_end = flight_session_end;
//	 }
//
//	 public void setFlight_controller(Flight_controller flight_controllerObject) {
//	  this.Flight_controllerObject = flight_controllerObject;
//	 }
//
//	 public void setBattery(Battery batteryObject) {
//	  this.BatteryObject = batteryObject;
//	 }
//
//	 public void setFlight_session_start(String flight_session_start) {
//	  this.flight_session_start = flight_session_start;
//	 }
//
//	 public void setLogfile_device_origin(Logfile_device_origin logfile_device_originObject) {
//	  this.Logfile_device_originObject = logfile_device_originObject;
//	 }
//	}
//	public class Logfile_device_origin {
//	 private String user_interface_idiom;
//	 private String operating_system;
//	 private String model;
//	 private String device_ssid;
//
//
//	 // Getter Methods 
//
//	 public String getUser_interface_idiom() {
//	  return user_interface_idiom;
//	 }
//
//	 public String getOperating_system() {
//	  return operating_system;
//	 }
//
//	 public String getModel() {
//	  return model;
//	 }
//
//	 public String getDevice_ssid() {
//	  return device_ssid;
//	 }
//
//	 // Setter Methods 
//
//	 public void setUser_interface_idiom(String user_interface_idiom) {
//	  this.user_interface_idiom = user_interface_idiom;
//	 }
//
//	 public void setOperating_system(String operating_system) {
//	  this.operating_system = operating_system;
//	 }
//
//	 public void setModel(String model) {
//	  this.model = model;
//	 }
//
//	 public void setDevice_ssid(String device_ssid) {
//	  this.device_ssid = device_ssid;
//	 }
//	}
//	public class Battery {
//	 private String serial_number;
//	 private String remaining_life;
//	 private String discharges;
//	 private String full_charge_volume;
//	 private String cell_number;
//	 private String firmware_version;
//
//
//	 // Getter Methods 
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getRemaining_life() {
//	  return remaining_life;
//	 }
//
//	 public String getDischarges() {
//	  return discharges;
//	 }
//
//	 public String getFull_charge_volume() {
//	  return full_charge_volume;
//	 }
//
//	 public String getCell_number() {
//	  return cell_number;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setRemaining_life(String remaining_life) {
//	  this.remaining_life = remaining_life;
//	 }
//
//	 public void setDischarges(String discharges) {
//	  this.discharges = discharges;
//	 }
//
//	 public void setFull_charge_volume(String full_charge_volume) {
//	  this.full_charge_volume = full_charge_volume;
//	 }
//
//	 public void setCell_number(String cell_number) {
//	  this.cell_number = cell_number;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Flight_controller {
//	 private String serial_number;
//	 private String firmware_version;
//
//
//	 // Getter Methods 
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Gcs {
//	 private String manufacturer;
//	 private String model;
//	 private String version;
//
//
//	 // Getter Methods 
//
//	 public String getManufacturer() {
//	  return manufacturer;
//	 }
//
//	 public String getModel() {
//	  return model;
//	 }
//
//	 public String getVersion() {
//	  return version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setManufacturer(String manufacturer) {
//	  this.manufacturer = manufacturer;
//	 }
//
//	 public void setModel(String model) {
//	  this.model = model;
//	 }
//
//	 public void setVersion(String version) {
//	  this.version = version;
//	 }
//	}
//	public class Summary {
//	 private String home_location_lat;
//	 private String home_location_lon;
//	 Aircraft_smart_gohome Aircraft_smart_gohomeObject;
//
//
//	 // Getter Methods 
//
//	 public String getHome_location_lat() {
//	  return home_location_lat;
//	 }
//
//	 public String getHome_location_lon() {
//	  return home_location_lon;
//	 }
//
//	 public Aircraft_smart_gohome getAircraft_smart_gohome() {
//	  return Aircraft_smart_gohomeObject;
//	 }
//
//	 // Setter Methods 
//
//	 public void setHome_location_lat(String home_location_lat) {
//	  this.home_location_lat = home_location_lat;
//	 }
//
//	 public void setHome_location_lon(String home_location_lon) {
//	  this.home_location_lon = home_location_lon;
//	 }
//
//	 public void setAircraft_smart_gohome(Aircraft_smart_gohome aircraft_smart_gohomeObject) {
//	  this.Aircraft_smart_gohomeObject = aircraft_smart_gohomeObject;
//	 }
//	}
//	public class Aircraft_smart_gohome {
//	 private String flight_return_time = null;
//	 private String landing_power = null;
//	 private String return_power;
//	 private String landing_radius;
//	 private String landing_time = null;
//
//
//	 // Getter Methods 
//
//	 public String getFlight_return_time() {
//	  return flight_return_time;
//	 }
//
//	 public String getLanding_power() {
//	  return landing_power;
//	 }
//
//	 public String getReturn_power() {
//	  return return_power;
//	 }
//
//	 public String getLanding_radius() {
//	  return landing_radius;
//	 }
//
//	 public String getLanding_time() {
//	  return landing_time;
//	 }
//
//	 // Setter Methods 
//
//	 public void setFlight_return_time(String flight_return_time) {
//	  this.flight_return_time = flight_return_time;
//	 }
//
//	 public void setLanding_power(String landing_power) {
//	  this.landing_power = landing_power;
//	 }
//
//	 public void setReturn_power(String return_power) {
//	  this.return_power = return_power;
//	 }
//
//	 public void setLanding_radius(String landing_radius) {
//	  this.landing_radius = landing_radius;
//	 }
//
//	 public void setLanding_time(String landing_time) {
//	  this.landing_time = landing_time;
//	 }
//	}
//	public class Aircraft {
//	 private String manufacturer;
//	 private String serial_number;
//	 private String name;
//	 private String model;
//	 private String firmware_version;
//
//
//	 // Getter Methods 
//
//	 public String getManufacturer() {
//	  return manufacturer;
//	 }
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getName() {
//	  return name;
//	 }
//
//	 public String getModel() {
//	  return model;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setManufacturer(String manufacturer) {
//	  this.manufacturer = manufacturer;
//	 }
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setName(String name) {
//	  this.name = name;
//	 }
//
//	 public void setModel(String model) {
//	  this.model = model;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Remote_controller {
//	 private String serial_number = null;
//	 private String firmware_version = null;
//
//
//	 // Getter Methods 
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Payload {
//	 Camera CameraObject;
//	 Gimbal GimbalObject;
//
//
//	 // Getter Methods 
//
//	 public Camera getCamera() {
//	  return CameraObject;
//	 }
//
//	 public Gimbal getGimbal() {
//	  return GimbalObject;
//	 }
//
//	 // Setter Methods 
//
//	 public void setCamera(Camera cameraObject) {
//	  this.CameraObject = cameraObject;
//	 }
//
//	 public void setGimbal(Gimbal gimbalObject) {
//	  this.GimbalObject = gimbalObject;
//	 }
//	}
//	public class Gimbal {
//	 private String serial_number = null;
//	 private String firmware_version;
//
//
//	 // Getter Methods 
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Camera {
//	 private String serial_number;
//	 private String model;
//	 private String firmware_version;
//
//
//	 // Getter Methods 
//
//	 public String getSerial_number() {
//	  return serial_number;
//	 }
//
//	 public String getModel() {
//	  return model;
//	 }
//
//	 public String getFirmware_version() {
//	  return firmware_version;
//	 }
//
//	 // Setter Methods 
//
//	 public void setSerial_number(String serial_number) {
//	  this.serial_number = serial_number;
//	 }
//
//	 public void setModel(String model) {
//	  this.model = model;
//	 }
//
//	 public void setFirmware_version(String firmware_version) {
//	  this.firmware_version = firmware_version;
//	 }
//	}
//	public class Flight_logging {
//	 ArrayList < Object > event = new ArrayList < Object > ();
//	 private String altitude_system;
//	 private String logging_start_dtg;
//	 ArrayList < Object > flight_logging_items = new ArrayList < Object > ();
//	 ArrayList < Object > flight_logging_keys = new ArrayList < Object > ();
//
//
//	 // Getter Methods 
//
//	 public String getAltitude_system() {
//	  return altitude_system;
//	 }
//
//	 public String getLogging_start_dtg() {
//	  return logging_start_dtg;
//	 }
//
//	 // Setter Methods 
//
//	 public void setAltitude_system(String altitude_system) {
//	  this.altitude_system = altitude_system;
//	 }
//
//	 public void setLogging_start_dtg(String logging_start_dtg) {
//	  this.logging_start_dtg = logging_start_dtg;
//	 }
//	}
//	public class File {
//	 private String creation_dtg;
//	 private String logging_type;
//	 private String filename;
//
//
//	 // Getter Methods 
//
//	 public String getCreation_dtg() {
//	  return creation_dtg;
//	 }
//
//	 public String getLogging_type() {
//	  return logging_type;
//	 }
//
//	 public String getFilename() {
//	  return filename;
//	 }
//
//	 // Setter Methods 
//
//	 public void setCreation_dtg(String creation_dtg) {
//	  this.creation_dtg = creation_dtg;
//	 }
//
//	 public void setLogging_type(String logging_type) {
//	  this.logging_type = logging_type;
//	 }
//
//	 public void setFilename(String filename) {
//	  this.filename = filename;
//	 }
//	}
