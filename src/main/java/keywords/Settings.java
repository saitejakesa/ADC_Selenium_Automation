package keywords;

import java.util.Arrays;

import com.aventstack.extentreports.Status;

public class Settings extends Validation {
	
	
	
	public void dialerDelay() throws Exception {
		log("changing the DialerDelay");
		log("clicking on DialerDelay Setting ");
		clickSetting("Dialer Delay");
		log("Setting got clicked and popup occuring ");
		expectedvalue=textgenerator(0, 254);
		log("changedvalue is "+expectedvalue);
		changebutton();
		log("Setting clicked on change button ");
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Dialer Delay");
		
		test.log(Status.INFO, "Displaying the panel current value "+actualvalue);
		//assertion.assertEquals(actualvalue, expectedvalue, "Expected and actualvalues are different so failed");
	}
	public void sirenTimeout() throws Exception {
		log( "changing the SirenTimeout");
		log("clicking on SirenTimeout Setting ");
		clickSetting("Siren Timeout");
		log("Setting got clicked and popup occuring ");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Siren Timeout");
		log("Displaying the panel current value "+actualvalue);
	}
	public void panelSiren() throws Exception {
		log("changing the PanelSiren");
		log("clicking on PanelSiren Setting ");
		clickSetting("Panel Siren");
		log("Setting got clicked and popup occuring ");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Siren");
		log("Displaying the panel current value "+actualvalue);
	}
	public void entryDelay() throws Exception {
		log("changing the EntryDelay");
		log("clicking on EntryDelay Setting ");
		clickSetting("Entry Delay");
		log("Setting got clicked and popup occuring ");
		expectedvalue=textgenerator(5, 240);
		log("changedvalue is "+expectedvalue);
		changebutton();	
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Entry Delay");
		log("Displaying the panel current value "+actualvalue);
	}
	public void exitDelay() throws Exception {
		log("changing the ExitDelay");
		log("clicking on ExitDelay Setting ");
		clickSetting("Exit Delay");
		log("Setting got clicked and popup occuring ");
		expectedvalue=textgenerator(5, 254);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Exit Delay");
	}
	public void autoBypass() throws Exception {
		log("changing the AutoBypass");
		log("clicking on AutoBypass Setting ");
		clickSetting("Auto Bypass");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Auto Bypass");
	}
	public void autoStay() throws Exception {
		log("changing the AutoStay");
		log("clicking on AutoStay Setting ");
		clickSetting("Auto Stay");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Auto Stay");
	}
	public void noDelay() throws Exception {
		log("changing the Arm Stay No Delay");
		log("clicking on Arm Stay No Delay Setting ");
		clickSetting("Arm Stay-No Delay");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Arm Stay-No Delay");
	}
	public void keyfobArming() throws Exception {
		log("changing the Keyfob Arming");
		log("clicking on Keyfob Arming ");
		clickSetting("Keyfob Instant Arming");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Keyfob Instant Arming");
	}
	public void temperature() throws Exception {
		log("changing the Temperature");
		log("clicking on Temperature ");
		clickSetting("Temperature");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Temperature");
	}
	public void language() throws Exception {
		log("changing the Language");
		log("clicking on Language ");
		clickSetting("Language");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Language");
	}
	public void supervisoryNonEmerg() throws Exception {
		log("changing the supervisoryNonEmerg");
		log("clicking on supervisoryNonEmerg ");
		clickSetting("Loss of Supervisory Signals (Non-Emergency Sensors)");
		log("Setting got clicked and popup occuring");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Loss of Supervisory Signals (Non-Emergency Sensors)");
	}
	public void secureArming() throws Exception {
		log("changing the secureArming");
		log("clicking on secureArming ");
		clickSetting("Secure Arming");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Secure Arming");
	}
	public void lowBatteryArming() throws Exception {
		log("changing the LowBatteryArming");
		log("clicking on LowBatteryArming ");
		clickSetting("Refuse Arming When Battery Low");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Refuse Arming When Battery Low");
	}
	public void sIALimits() throws Exception {
		log("changing the SIALimits");
		log("clicking on SIALimits ");
		clickSetting("SIA Limits");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("SIA Limits");
	}
	public void mediaVolume() throws Exception {
		log("changing the MediaVolume");
		log("clicking on MediaVolume ");
		clickSetting("Media Volume");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Media Volume");
	}
	public void allVoicePrompts() throws Exception {
		log("changing the allVoicePrompts");
		log("clicking on allVoicePrompts ");
		clickSetting("All Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("All Voice Prompts");
	}
	public void sensorVoicePrompts() throws Exception {
		log("changing the sensorVoicePrompts");
		log("clicking on sensorVoicePrompts ");
		clickSetting("Sensor Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Voice Prompts");
	}
	public void panelVoicePrompts() throws Exception {
		log("changing the PanelVoicePrompts");
		log("clicking on PanelVoicePrompts ");
		clickSetting("Panel Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Voice Prompts");
	}
	public void safetySensorVoicePrompts() throws Exception {
		log("changing the SafetySensorVoicePrompts");
		log("clicking on SafetySensorVoicePrompts ");
		clickSetting("Safety Sensor Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Safety Sensor Voice Prompts");
	}
	public void allChimes() throws Exception {
		log("changing the AllChimes");
		log("clicking on AllChimes ");
		clickSetting("All Chimes");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("All Chimes");
	}
	public void sensorChimes() throws Exception {
		log("changing the SensorChimes");
		log("clicking on SensorChimes ");
		clickSetting("Sensor Chimes");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Chimes");
	}
	public void panelChimes() throws Exception {
		log("changing the panelChimes");
		log("clicking on panelChimes ");
		clickSetting("Panel Chimes");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Chimes");
	}
	public void safetySensorChimes() throws Exception {
		log("changing the Safety Sensor Chimes");
		log("clicking on Safety Sensor Chimes ");
		clickSetting("Safety Sensor Chimes");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Safety Sensor Chimes");
	}
	public void brightness() throws Exception {
		log("changing the Brightness");
		log("clicking on Brightness ");
		clickSetting("Brightness");
		expectedvalue=textgenerator(0, 255);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Brightness");
	}
	public void duration() throws Exception {
		log("changing the Photo Frame Duration");
		log("clicking on Photo Frame Duration ");
		clickSetting("Photo Frame Duration");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Photo Frame Duration");
	}
	public void transitionEffect() throws Exception {
		log("changing the Transition Effect");
		log("clicking on Transition Effect");
		clickSetting("Transition Effect");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Transition Effect");
	}
	public void shuffle() throws Exception {
		log("changing the Photo Frame Shuffle");
		log("clicking on Photo Frame Shuffle");
		clickSetting("Photo Frame Shuffle");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Photo Frame Shuffle");
	}
	public void displayType() throws Exception {
		log("changing the Display Type");
		log("clicking on Display Type");
		clickSetting("Display Type");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Display Type");
	}
	public void photoFrameStartTime() throws Exception {
		log("changing the Photo Frame Start Time");
		log("clicking on Photo Frame Start Time");
		clickSetting("Photo Frame Start Time");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Photo Frame Start Time");
	}
	public void nightmodestart() throws Exception {
		log("changing the Night Time Mode Start");
		log("clicking on Night Time Mode Start");
		clickSetting("Night Time Mode Start");
		String[] expectedvaluetime = DateSelector(12, 00, 60, 00);
		//int time=StringToInt(expectedvaluetime);
		log("changedvalue is "+Arrays.toString(expectedvaluetime));
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Night Time Mode Start");
	}
	
	public void nightmodeend() throws Exception {
		log("changing the Night Time Mode End");
		log("clicking on Night Time Mode End");
		clickSetting("Night Time Mode End");
		String[] expectedvaluetime = DateSelector(12, 00, 60, 00);
		log("changedvalue is "+Arrays.toString(expectedvaluetime));
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Night Time Mode End");
	}
	public void accountNumber() throws Exception {
		log("changing the Account Number");
		log("clicking on Account Number");
		clickSetting("Account Number");
		expectedvalue=textgenerator(9999999999L,1000000000);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Account Number");
	}
	public void zwave() throws Exception {
		log("changing the zwave");
		log("clicking on zwave");
		clickSetting("Z-Wave");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave");
	}
	public void powerManagement() throws Exception {
		log("changing the powerManagement");
		log("clicking on powerManagement");
		clickSetting("Power Management");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Power Management");
	}
	public void sIAPowerRestoration() throws Exception {
		log("changing the sIAPowerRestoration");
		log("clicking on sIAPowerRestoration");
		clickSetting("SIA Power Restoration");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("SIA Power Restoration");
	}
	public void sensorLowBatteryTroubleBeep() throws Exception {
		log("changing the sensorLowBatteryTroubleBeep");
		log("clicking on sensorLowBatteryTroubleBeep");
		clickSetting("Sensor Low Battery Trouble Beep");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Low Battery Trouble Beep");
	}
	public void sensorTamperTroubleBeep() throws Exception {
		log("changing the Sensor Tamper Trouble Beep");
		log("clicking on Sensor Tamper Trouble Beep");
		clickSetting("Sensor Tamper Trouble Beep");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Tamper Trouble Beep");
	}
	public void troubleBeepsTimeout() throws Exception {
		log("changing the Trouble Beeps Timeout");
		log("clicking on Trouble Beeps Timeout");
		clickSetting("Trouble Beeps Timeout");
		expectedvalue=textgenerator(3,60);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Trouble Beeps Timeout");
	}
	public void autoExitTimeExtension() throws Exception {
		log("changing the Auto Exit Time Extension");
		log("clicking on Auto Exit Time Extension");
		clickSetting("Auto Exit Time Extension");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Auto Exit Time Extension");
	}
	public void thermostatDevice() throws Exception {
		log("changing the Z-Wave Thermostat Device Limit");
		log("clicking on Z-Wave Thermostat Device Limit");
		clickSetting("Z-Wave Thermostat Device Limit");
		expectedvalue=textgenerator(0,40);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave Thermostat Device Limit");
	}
	public void lockDevices() throws Exception {
		log("changing the Z-Wave Lock Device Limit");
		log("clicking on Z-Wave Lock Device Limit");
		clickSetting("Z-Wave Lock Device Limit");
		expectedvalue=textgenerator(0,20);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave Lock Device Limit");
	}
	public void dimmerDevices() throws Exception {
		log("changing the Z-Wave Dimmer Device Limit");
		log("clicking on Z-Wave Dimmer Device Limit");
		clickSetting("Z-Wave Dimmer Device Limit");
		expectedvalue=textgenerator(0,80);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave Dimmer Device Limit");
	}
	public void logLevel() throws Exception {
		log("changing the Log Level");
		log("clicking on Log Level");
		clickSetting("Log Level");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Log Level");
	}
	public void masterCodeZwave() throws Exception {
		log("changing the Allow Master Code Z-Wave Settings");
		log("clicking on Allow Master Code Z-Wave Settings");
		clickSetting("Allow Master Code Z-Wave Settings");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Master Code Z-Wave Settings");
	}
	public void fireVerification() throws Exception {
		log("changing the Fire Verification");
		log("clicking on Fire Verifications");
		clickSetting("Fire Verification");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Fire Verification");
	}
	public void disarmPhotos() throws Exception {
		log("changing the Disarm Photos");
		log("clicking on Disarm Photos");
		clickSetting("Disarm Photos");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Disarm Photos");
	}
	public void severeWeatherSirenWarning() throws Exception {
		log("changing the Severe Weather Siren Warning");
		log("clicking on Severe Weather Siren Warning");
		clickSetting("Severe Weather Siren Warning");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Severe Weather Siren Warning");
	}
	public void secureDeleteImages() throws Exception {
		log("changing the Secure Delete Images");
		log("clicking on Secure Delete Images");
		clickSetting("Secure Delete Images");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Secure Delete Images");
	}
	public void mastercodeSirenAndAlarm() throws Exception {
		log("changing the Allow Master Code to Access Siren and Alarms");
		log("clicking on Allow Master Code to Access Siren and Alarms");
		clickSetting("Allow Master Code to Access Siren and Alarms");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Master Code to Access Siren and Alarms");
	}
	public void mastercodeSecurityandArming() throws Exception {
		log("changing the Allow Master Code to Access Security and Arming");
		log("clicking on Allow Master Code to Access Security and Arming");
		clickSetting("Allow Master Code to Access Security and Arming");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Master Code to Access Security and Arming");
	}
	public void mastercodeCameraSettings() throws Exception {
		log("changing the Allow Master Code to Access Camera Settings");
		log("clicking on Allow Master Code to Access Camera Settings");
		clickSetting("Allow Master Code to Access Camera Settings");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Master Code to Access Camera Settings");
	}
	public void mastercodeZwaveManagement() throws Exception {
		log("changing the Allow Master Code Z-Wave Management");
		log("clicking on Allow Master Code Z-Wave Management");
		clickSetting("Allow Master Code Z-Wave Management");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Master Code Z-Wave Management");
	}
	public void alarmPhotos() throws Exception {
		log("changing the Alarm Photos");
		log("clicking on Alarm Photos");
		clickSetting("Alarm Photos");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Alarm Photos");
	}
	public void allTroubleBeeps() throws Exception {
		log("changing the All Trouble Beeps");
		log("clicking on All Trouble Beeps");
		clickSetting("All Trouble Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("All Trouble Beeps");
	}
	public void panelTamperTroubleBeep() throws Exception {
		log("changing the Panel Tamper Trouble Beep");
		log("clicking on Panel Tamper Trouble Beep");
		clickSetting("Panel Tamper Trouble Beep");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Tamper Trouble Beep");
	}
	public void longEntryDelay() throws Exception {
		log("changing the Long Entry Delay");
		log("clicking on Long Entry Delay");
		clickSetting("Long Entry Delay");
		expectedvalue=textgenerator(240, 5);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Long Entry Delay");
	}
	public void longExitDelay() throws Exception {
		log("changing the Long Exit Delay");
		log("clicking on Long Exit Delay");
		clickSetting("Long Exit Delay");
		expectedvalue=textgenerator(254, 5);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Long Exit Delay");
	}
	public void localZWaveVoicePrompts() throws Exception {
		log("changing the Local Z-Wave Voice Prompts");
		log("clicking on Local Z-Wave Voice Prompts");
		clickSetting("Local Z-Wave Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Local Z-Wave Voice Prompts");
	}
	public void remoteZWaveVoicePrompts() throws Exception {
		log("changing the Remote Z-Wave Voice Prompts");
		log("clicking on Remote Z-Wave Voice Prompts");
		clickSetting("Remote Z-Wave Voice Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Remote Z-Wave Voice Prompts");
	}
	public void supervisoryEmergency() throws Exception {
		log("changing the Loss of Supervisory Signals for Emergency sensors)");
		log("clicking on Local Loss of Supervisory Signals for Emergency sensors");
		clickSetting("Loss of Supervisory Signals (Emergency-only)");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Loss of Supervisory Signals (Emergency-only)");
	}
	public void sirenAnnunciation() throws Exception {
		log("changing the Siren Annunciation");
		log("clicking on Siren Annunciation");
		clickSetting("Siren Annunciation");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Siren Annunciation");
	}
	public void wellnessSupport() throws Exception {
		log("changing the Wellness Support");
		log("clicking on Wellness Support");
		clickSetting("Wellness Support");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Wellness Support");
	}
	public void waterFreezeSiren() throws Exception {
		log("changing the Water/Freeze Siren");
		log("clicking on Water/Freeze Siren");
		clickSetting("Water/Freeze Siren");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Water/Freeze Siren");
	}
	public void rFJamDetectionAlarm() throws Exception {
		log("changing the RF Jam Detection Alarm");
		log("clicking on RF Jam Detection Alarm");
		clickSetting("RF Jam Detection Alarm");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("RF Jam Detection Alarm");
	}
	public void otherZWaveDeviceLimit() throws Exception {
		log("changing the Other Z-Wave Device Limit");
		log("clicking on Other Z-Wave Device Limit");
		clickSetting("Other Z-Wave Device Limit");
		expectedvalue=textgenerator(21, 0);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Other Z-Wave Device Limit");
	}
	public void rFJamDetection() throws Exception {
		log("changing the RF Jam Detection");
		log("clicking on RF Jam Detection");
		clickSetting("RF Jam Detection");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("RF Jam Detection");
	}
	public void rFJamSensitivityLevel() throws Exception {
		log("changing the RF Jam Sensitivity Level");
		log("clicking on RF Jam Sensitivity Level");
		clickSetting("RF Jam Sensitivity Level");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("RF Jam Detection");
	}
	public void allowKeyfobAlarmDisarm() throws Exception {
		log("changing the Allow Keyfob Alarm Disarm");
		log("clicking on Allow Keyfob Alarm Disarm");
		clickSetting("Allow Keyfob Alarm Disarm");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow Keyfob Alarm Disarm");
	}
	public void panelcommunicationtestfrequency() throws Exception {
		log("changing the Panel communication test frequency");
		log("clicking on Panel communication test frequency");
		clickSetting("Panel communication test frequency");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel communication test frequency");
	}
	public void policepanic() throws Exception {
		log("changing the Police panic");
		log("clicking on Police panic");
		clickSetting("Police panic");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Police panic");
	}
	public void firepanic() throws Exception {
		log("changing the Fire panic");
		log("clicking on Fire panic");
		clickSetting("Fire panic");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Fire panic");
	}
	public void auxiliarypanic() throws Exception {
		log("changing the Auxiliary panic");
		log("clicking on Auxiliary panic");
		clickSetting("Auxiliary panic");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Auxiliary panic");
	}
	public void keyfobDisarming() throws Exception {
		log("changing the Keyfob Disarming");
		log("clicking on Keyfob Disarming");
		clickSetting("Keyfob Disarming");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Keyfob Disarming");
	}
	public void voicesVolume() throws Exception {
		log("changing the Voices Volume");
		log("clicking on Voices Volume");
		clickSetting("Voices Volume");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Voices Volume");
	}
	public void beepsandChimesvolume() throws Exception {
		log("changing the Beeps and Chimes volume");
		log("clicking on Beeps and Chimes volume");
		clickSetting("Beeps and Chimes volume");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Beeps and Chimes volume");
	}
	public void bluetoothDisarm() throws Exception {
		log("changing the Bluetooth Disarm");
		log("clicking on Bluetooth Disarm");
		clickSetting("Bluetooth Disarm");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Bluetooth Disarm");
	}
	public void bluetoothDisarmTimeout() throws Exception {
		log("changing the Bluetooth Disarm Timeout");
		log("clicking on Bluetooth Disarm Timeout");
		clickSetting("Bluetooth Disarm Timeout");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Bluetooth Disarm Timeout");
	}
	public void touchSounds() throws Exception {
		log("changing the Touch Sounds");
		log("clicking on Touch Sounds");
		clickSetting("Touch Sounds");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Touch Sounds");
	}
	public void fontSize() throws Exception {
		log("changing the Font Size");
		log("clicking on Font Size");
		clickSetting("Font Size");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Font Size");
	}
	public void bluetooth() throws Exception {
		log("changing the Bluetooth");
		log("clicking on Bluetooth");
		clickSetting("Bluetooth");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Bluetooth");
	}
	public void settingPhotos() throws Exception {
		log("changing the Setting Photos");
		log("clicking on Setting Photos");
		clickSetting("Setting Photos");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Setting Photos");
	}
	public void garageDoorDeviceLimit() throws Exception {
		log("changing the Z-Wave Garage Door Device Limit");
		log("clicking on Z-Wave Garage Door Device Limit");
		clickSetting("Z-Wave Garage Door Device Limit");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave Garage Door Device Limit");
	}
	public void fireandLifeSafetyDeviceTroubleBeeps() throws Exception {
		log("changing the Fire and Life Safety Device Trouble Beeps");
		log("clicking on Fire and Life Safety Device Trouble Beeps");
		clickSetting("Fire and Life Safety Device Trouble Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Fire and Life Safety Device Trouble Beeps");
	}
	public void sensorTamperTroubleBeeps() throws Exception {
		log("changing the Sensor Tamper Trouble Beeps");
		log("clicking on Sensor Tamper Trouble Beeps");
		clickSetting("Sensor Tamper Trouble Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Tamper Trouble Beeps");
	}
	public void panelTamperBeeps() throws Exception {
		log("changing the Panel Tamper Beeps");
		log("clicking on Panel Tamper Beeps");
		clickSetting("Panel Tamper Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Tamper Beeps");
	}
	public void sensorLowBatteryBeeps() throws Exception {
		log("changing the Sensor Low Battery Beeps");
		log("clicking on Sensor Low Battery Beeps");
		clickSetting("Sensor Low Battery Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Low Battery Beeps");
	}
	public void panelTamper() throws Exception {
		log("changing the Panel Tamper");
		log("clicking on Panel Tamper");
		clickSetting("Panel Tamper");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Tamper");
	}
	public void panelGlassBreakSensor() throws Exception {
		log("changing the Panel Glass Break Sensor");
		log("clicking on Panel Glass Break Sensor");
		clickSetting("Panel Glass Break Sensor");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Glass Break Sensor");
	}
	public void panelGlassBreakSensorSensitivity() throws Exception {
		log("changing the Panel Glass Break Sensor Sensitivity");
		log("clicking on Panel Glass Break Sensor Sensitivity");
		clickSetting("Panel Glass Break Sensor Sensitivity");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Glass Break Sensor Sensitivity");
	}
	public void safetySensorSounds() throws Exception {
		log("changing the Safety Sensor Sounds");
		log("clicking on Safety Sensor Sounds");
		clickSetting("Safety Sensor Sounds");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Safety Sensor Sounds");
	}
	public void swingerShutdown() throws Exception {
		log("changing the Swinger Shutdown");
		log("clicking on Swinger Shutdown");
		clickSetting("Swinger Shutdown");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Swinger Shutdown");
	}
	public void swingerShutdownTripCount() throws Exception {
		log("changing the Swinger Shutdown Trip Count");
		log("clicking on Swinger Shutdown Trip Count");
		clickSetting("Swinger Shutdown Trip Count");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Swinger Shutdown Trip Count");
	}
	public void masterUserAddSensors() throws Exception {
		log("changing the Master User Add Sensors");
		log("clicking on Master User Add Sensors");
		clickSetting("Master User Add Sensors");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Master User Add Sensors");
	}
	public void nightTimeModeSetting() throws Exception {
		log("changing the Night-Time Mode Setting");
		log("clicking on Night-Time Mode Setting");
		clickSetting("Master User Add Sensors");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Night-Time Mode Setting");
	}
	public void sensorAutoLearnOpenCloseReports() throws Exception {
		log("changing the Sensor Auto-Learn Open/Close Reports");
		log("clicking on Sensor Auto-Learn Open/Close Reports");
		clickSetting("Sensor Auto-Learn Open/Close Reports");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Sensor Auto-Learn Open/Close Reports");
	}
	public void panelWiFiConnectivityWarningPrompts() throws Exception {
		log("changing the Panel Wi-Fi Connectivity Warning Prompts");
		log("clicking on Panel Wi-Fi Connectivity Warning Prompts");
		clickSetting("Panel Wi-Fi Connectivity Warning Prompts");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Wi-Fi Connectivity Warning Prompts");
	}
	public void panelCameraMotionDetector() throws Exception {
		log("changing the Panel Camera Motion Detector");
		log("clicking on Panel Camera Motion Detector");
		clickSetting("Panel Camera Motion Detector");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Camera Motion Detector");
	}
	public void zWavePrimaryController() throws Exception {
		log("changing the Z-Wave Primary Controller");
		log("clicking on Z-Wave Primary Controller");
		clickSetting("Z-Wave Primary Controller");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Z-Wave Primary Controller");
	}
	public void backgroundDownloadforUpdates() throws Exception {
		log("changing the Background Download for Updates");
		log("clicking on Background Download for Updates");
		clickSetting("Background Download for Updates");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Background Download for Updates");
	}
	public void manageMyHome() throws Exception {
		log("changing the Allow software updates from \"Manage My Home\"");
		log("clicking on Allow software updates from \"Manage My Home\"");
		clickSetting("Allow software updates from \"Manage My Home\"");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Allow software updates from \"Manage My Home\"");
	}
	public void softwareUpdateCheckInterval() throws Exception {
		log("changing the Software Update Check Interval");
		log("clicking on Software Update Check Interval");
		clickSetting("Software Update Check Interval");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Software Update Check Interval");
	}
	public void partitions() throws Exception {
		log("changing the Partitions");
		log("clicking on Partitions");
		clickSetting("Partitions");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Partitions");
	}
	public void digit6UserCodes() throws Exception {
		log("changing the 6 Digit User Codes");
		log("clicking on 6 Digit User Codes");
		clickSetting("6 Digit User Codes");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("6 Digit User Codes");
	}
	public void useCommercialSensorandDeviceNames() throws Exception {
		log("changing the Use Commercial Sensor and Device Names");
		log("clicking on Use Commercial Sensor and Device Names");
		clickSetting("Use Commercial Sensor and Device Names");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Use Commercial Sensor and Device Names");
	}
	public void wizSoftwareUpdateStep() throws Exception {
		log("changing the wiz Software Update Step");
		log("clicking on wiz Software Update Step");
		clickSetting("- Software Update Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Software Update Step");
	}
	public void wizSecuritySensorsStep() throws Exception {
		log("changing the wizSecurity Sensors Step");
		log("clicking on wizSecurity Sensors Step");
		clickSetting("- Security Sensors Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Security Sensors Step");
	}
	public void wizPanelGlassBreakStep() throws Exception {
		log("changing the - Panel Glass Break Step");
		log("clicking on - Panel Glass Break Step");
		clickSetting("- Panel Glass Break Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Panel Glass Break Step");
	}
	public void wizZWaveDevicesStep() throws Exception {
		log("changing the - Z-Wave Devices Step");
		log("clicking on - Z-Wave Devices Step");
		clickSetting("- Z-Wave Devices Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Z-Wave Devices Step");
	}
	public void wizBluetoothDevicesStep() throws Exception {
		log("changing the - Bluetooth Devices Step");
		log("clicking on - Bluetooth Devices Step");
		clickSetting("- Bluetooth Devices Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Bluetooth Devices Step");
	}
	public void wizUsersStep() throws Exception {
		log("changing the - Users Step");
		log("clicking on - Users Step");
		clickSetting("- Users Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Users Step");
	}
	public void wizDealerStep() throws Exception {
		log("changing the - Dealer Step");
		log("clicking on - Dealer Step");
		clickSetting("- Dealer Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Dealer Step");
	}
	public void wizSecuritySensorSetupType() throws Exception {
		log("changing the - Security Sensor Setup Type");
		log("clicking on - Security Sensor Setup Type");
		clickSetting("- Security Sensor Setup Type");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Security Sensor Setup Type");
	}
	public void globalFireSiren() throws Exception {
		log("changing the Global Fire Siren");
		log("clicking on Global Fire Siren");
		clickSetting("Global Fire Siren");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Global Fire Siren");
	}
	public void alarmVideos() throws Exception {
		log("changing the Alarm Videos");
		log("clicking on Alarm Videos");
		clickSetting("Alarm Videos");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Alarm Videos");
	}
	public void secondPreferredLanguage() throws Exception {
		log("changing the Second Preferred Language");
		log("clicking on Second Preferred Language");
		clickSetting("Second Preferred Language");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Second Preferred Language");
	}
	public void wizIQRemoteStep() throws Exception {
		log("changing the - IQ Remote Step");
		log("clicking on - IQ Remote Step");
		clickSetting("- IQ Remote Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- IQ Remote Step");
	}
	public void wizSensorTestStep() throws Exception {
		log("changing the - Sensor Test Step");
		log("clicking on - Sensor Test Step");
		clickSetting("- Sensor Test Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Sensor Test Step");
	}
	public void lockScreen() throws Exception {
		log("changing the Lock Screen");
		log("clicking on Lock Screen");
		clickSetting("Lock Screen");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Lock Screen");
	}
	public void exitBeeps() throws Exception {
		log("changing the Exit Beeps");
		log("clicking on Exit Beeps");
		clickSetting("Exit Beeps");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Exit Beeps");
	}
	public void timeFormat() throws Exception {
		log("changing the Time Format");
		log("clicking on Time Format");
		clickSetting("Time Format");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Time Format");
	}
	public void scenesSupport() throws Exception {
		log("changing the Scenes Support");
		log("clicking on Scenes Support");
		clickSetting("Scenes Support");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Scenes Support");
	}
	public void wellnessPage() throws Exception {
		log("changing the Wellness Page");
		log("clicking on Wellness Page");
		clickSetting("Wellness Page");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Wellness Page");
	}
	public void checkInCheckOut() throws Exception {
		log("changing the Check-In/Check-Out");
		log("clicking on Check-In/Check-Out");
		clickSetting("Check-In/Check-Out");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Check-In/Check-Out");
	}
	public void securityPage() throws Exception {
		log("changing the Security Page");
		log("clicking on Security Page");
		clickSetting("Security Page");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Security Page");
	}
	public void streamLiveVideoCamerastoIQRemote() throws Exception {
		log("changing the Stream Live Video Cameras to IQ Remote");
		log("clicking on Stream Live Video Cameras to IQ Remote");
		clickSetting("Stream Live Video Cameras to IQ Remote");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Stream Live Video Cameras to IQ Remote");
	}
	public void globalChimesandVoices() throws Exception {
		log("changing the Global Chimes and Voices");
		log("clicking on Global Chimes and Voices");
		clickSetting("Global Chimes and Voices");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Global Chimes and Voices");
	}
	public void globalIntrusionSoundsandSirens() throws Exception {
		log("changing the Global Intrusion Sounds and Sirens");
		log("clicking on Global Intrusion Sounds and Sirens");
		clickSetting("Global Intrusion Sounds and Sirens");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Global Intrusion Sounds and Sirens");
	}
	public void globalAuxiliarySirens() throws Exception {
		log("changing the Global Auxiliary Sirens");
		log("clicking on Global Auxiliary Sirens");
		clickSetting("Global Auxiliary Sirens");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Global Auxiliary Sirens");
	}
	public void allSoundsinPartition1() throws Exception {
		log("changing the All Sounds in Partition 1");
		log("clicking on All Sounds in Partition 1");
		clickSetting("All Sounds in Partition 1");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("All Sounds in Partition 1");
	}
	public void powerGLossofSupervisoryforNonEmergencySensors() throws Exception {
		log("changing the PowerG Loss of Supervisory for Non-Emergency Sensors");
		log("clicking on PowerG Loss of Supervisory for Non-Emergency Sensors");
		clickSetting("PowerG Loss of Supervisory for Non-Emergency Sensors");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("PowerG Loss of Supervisory for Non-Emergency Sensors");
	}
	public void powerGLossofSupervisoryforEmergencySensors() throws Exception {
		log("changing the PowerG Loss of Supervisory for Emergency Sensors");
		log("clicking on PowerG Loss of Supervisory for Emergency Sensors");
		clickSetting("PowerG Loss of Supervisory for Emergency Sensors");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("PowerG Loss of Supervisory for Emergency Sensors");
	}
	public void panelCamera() throws Exception {
		log("changing the Panel Camera");
		log("clicking on Panel Camera");
		clickSetting("All Sounds in Partition 1");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("All Sounds in Partition 1");
	}
	public void engrade2() throws Exception {
		log("changing the EN Grade 2");
		log("clicking on EN Grade 2");
		clickSetting("EN Grade 2");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("EN Grade 2");
	}
	public void powerGRFJam() throws Exception {
		log("changing the PowerG RF Jam");
		log("clicking on PowerG RF Jam");
		clickSetting("PowerG RF Jam");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("PowerG RF Jam");
	}
	public void installerAccessRequiresUserPermission() throws Exception {
		log("changing the Installer Access Requires User Permission");
		log("clicking on Installer Access Requires User Permission");
		clickSetting("Installer Access Requires User Permission");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Installer Access Requires User Permission");
	}
	public void powerGSmokeDetectorSiren() throws Exception {
		log("changing the PowerG Smoke Detector Siren");
		log("clicking on PowerG Smoke Detector Siren");
		clickSetting("PowerG Smoke Detector Siren");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("PowerG Smoke Detector Siren");
	}
	public void eUEventSwingerShutdownCount() throws Exception {
		log("changing the EU Event Swinger Shutdown Count");
		log("clicking on EU Event Swinger Shutdown Count");
		clickSetting("EU Event Swinger Shutdown Count");
		expectedvalue=textgenerator(10, 3);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("EU Event Swinger Shutdown Count");
	}
	public void lEDIndicator() throws Exception {
		log("changing the LED Indicator");
		log("clicking on LED Indicator");
		clickSetting("LED Indicator");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("LED Indicator");
	}
	public void iQRemoteResetAuthentication() throws Exception {
		log("changing the IQ Remote Reset Authentication");
		log("clicking on IQ Remote Reset Authentication");
		clickSetting("IQ Remote Reset Authentication");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("IQ Remote Reset Authentication");
	}
	public void panelAmbientNoiseDetector_BETA() throws Exception {
		log("changing the Panel Ambient Noise Detector (BETA)");
		log("clicking on Panel Ambient Noise Detector (BETA)");
		clickSetting("Panel Ambient Noise Detector (BETA)");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Panel Ambient Noise Detector (BETA)");
	}
	public void downloadMobileAppStep() throws Exception {
		log("changing the Wizard - Download Mobile App Step");
		log("clicking on Wizard- Download Mobile App Step");
		clickSetting("- Download Mobile App Step");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("- Download Mobile App Step");
	}
	public void streamSolarData() throws Exception {
		log("changing the Stream Solar Data");
		log("clicking on Stream Solar Data");
		clickSetting("Stream Solar Data");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Stream Solar Data");
	}
	public void uLCCommercialPowerRestoration() throws Exception {
		log("changing the ULC Commercial Power Restoration");
		log("clicking on ULC Commercial Power Restoration");
		clickSetting("ULC Commercial Power Restoration");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("ULC Commercial Power Restoration");
	}
	public void autoCommunicationTestStartTime() throws Exception {
		log("changing the Auto Communication Test Start Time");
		log("clicking on Auto Communication Test Start Time");
		clickSetting("Auto Communication Test Start Time");
		String[] expectedvalue=DateSelector(23, 00, 60, 00);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Auto Communication Test Start Time");
	}
	public void engineersReset() throws Exception {
		log("changing the Engineer's Reset");
		log("clicking on Engineer's Reset");
		clickSetting("Engineer's Reset");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Engineer's Reset");
	}
	public void sirenforWirelessSupervisoryFailures() throws Exception {
		log("changing the Siren for Wireless Supervisory Failures");
		log("clicking on Siren for Wireless Supervisory Failures");
		clickSetting("Siren for Wireless Supervisory Failures");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Siren for Wireless Supervisory Failures");
	}
	public void burglaryAlarmConfirmation() throws Exception {
		log("changing the Burglary Alarm Confirmation");
		log("clicking on Burglary Alarm Confirmation");
		clickSetting("Burglary Alarm Confirmation");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Burglary Alarm Confirmation");
	}
	public void burglaryAlarmConfirmationTimer_minutes() throws Exception {
		log("changing the Burglary Alarm Confirmation Timer (minutes)");
		log("clicking on Burglary Alarm Confirmation Timer (minutes)");
		clickSetting("Burglary Alarm Confirmation Timer (minutes)");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Burglary Alarm Confirmation Timer (minutes)");
	}
	public void uKFinalExitDoorArming() throws Exception {
		log("changing the UK Final Exit Door Arming");
		log("clicking on UK Final Exit Door Arming");
		clickSetting("UK Final Exit Door Arming");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("UK Final Exit Door Arming");
	}
	public void ambientNoiseDetectiondBThreshold() throws Exception {
		log("changing the Ambient Noise Detection dB Threshold");
		log("clicking on Ambient Noise Detection dB Threshold");
		clickSetting("Ambient Noise Detection dB Threshold");
		expectedvalue=textgenerator(95, 75);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Ambient Noise Detection dB Threshold");
	}
	public void noiseDetectorDuration() throws Exception {
		log("changing the Noise Detector Duration");
		log("clicking on Noise Detector Duration");
		clickSetting("Noise Detector Duration");
		expectedvalue=textgenerator(20, 5);
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Noise Detector Duration");
	}
	public void noiseDetectorPopup() throws Exception {
		log("changing the Noise Detector Popup");
		log("clicking on Noise Detector Popup");
		clickSetting("Noise Detector Popup");
		expectedvalue=OptionSelector();
		log("changedvalue is "+expectedvalue);
		changebutton();
		waitforload(70);
		refresh();
		actualvalue =SettingActualValuevalidation("Noise Detector Popup");
	}
	}
