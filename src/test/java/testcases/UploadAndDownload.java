package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

//import settings.Settings;
import testbase.BaseTest;


public class UploadAndDownload extends BaseTest {
	@Test
	public void DialerDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to dialerDelay");
		app.dialerDelay();
		test.log(Status.INFO, "completed navigate to dialerDelay method");
		app.sameSetting();
		app.settingvalidator();
	}
	@Test
	public void SirenTimeout(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to SirenTimeout");
		app.sirenTimeout();
		test.log(Status.INFO, "completed navigate to SirenTimeout method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelSiren(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to PanelSiren");
		app.panelSiren();
		test.log(Status.INFO, "completed navigate to PanelSiren method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void EntryDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to EntryDelay");
		app.entryDelay();
		test.log(Status.INFO, "completed navigate to EntryDelay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ExitDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to ExitDelay");
		app.exitDelay();
		test.log(Status.INFO, "completed navigate to ExitDelay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AutoBypass(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to AutoBypass");
		app.autoBypass();
		test.log(Status.INFO, "completed navigate to AutoBypass method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AutoStay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to AutoStay");
		app.autoStay();
		test.log(Status.INFO, "completed navigate to AutoStay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void NoDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to NoDelay");
		app.noDelay();
		test.log(Status.INFO, "completed navigate to NoDelay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void KeyfobArming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to KeyfobArming");
		app.keyfobArming();
		test.log(Status.INFO, "completed navigate to KeyfobArming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Temperature(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to Temperature");
		app.temperature();
		test.log(Status.INFO, "completed navigate to Temperature method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Language(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to Language");
		app.language();
		test.log(Status.INFO, "completed navigate to Language method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SupervisoryNonEmerg(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to SupervisoryNonEmerg");
		app.supervisoryNonEmerg();
		test.log(Status.INFO, "completed navigate to SupervisoryNonEmerg method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SecureArming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to SecureArming");
		app.secureArming();
		test.log(Status.INFO, "completed navigate to SecureArming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LowBatteryArming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to LowBatteryArming");
		app.lowBatteryArming();
		test.log(Status.INFO, "completed navigate to LowBatteryArming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SIALimits(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to SIALimits");
		app.sIALimits();
		test.log(Status.INFO, "completed navigate to SIALimits method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MediaVolume(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to mediaVolume");
		app.mediaVolume();
		test.log(Status.INFO, "completed navigate to mediaVolume method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AllVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to allVoicePrompts");
		app.allVoicePrompts();
		test.log(Status.INFO, "completed navigate to allVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SensorVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorVoicePrompts");
		app.sensorVoicePrompts();
		test.log(Status.INFO, "completed navigate to sensorVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelVoicePrompts");
		app.panelVoicePrompts();
		test.log(Status.INFO, "completed navigate to panelVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SafetySensorVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to safetySensorVoicePrompts");
		app.safetySensorVoicePrompts();
		test.log(Status.INFO, "completed navigate to safetySensorVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AllChimes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to allChimes");
		app.allChimes();
		test.log(Status.INFO, "completed navigate to allChimes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SensorChimes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorChimes");
		app.sensorChimes();
		test.log(Status.INFO, "completed navigate to sensorChimes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelChimes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelChimes");
		app.panelChimes();
		test.log(Status.INFO, "completed navigate to panelChimes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SafetySensorChimes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to safetySensorChimes");
		app.safetySensorChimes();
		test.log(Status.INFO, "completed navigate to safetySensorChimes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Brightness(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to brightness");
		app.brightness();
		test.log(Status.INFO, "completed navigate to brightness method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Duration(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to duration");
		app.duration();
		test.log(Status.INFO, "completed navigate to duration method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void TransitionEffect(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to transitionEffect");
		app.transitionEffect();
		test.log(Status.INFO, "completed navigate to transitionEffect method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Shuffle(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to shuffle");
		app.shuffle();
		test.log(Status.INFO, "completed navigate to shuffle method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void DisplayType(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to displayType");
		app.displayType();
		test.log(Status.INFO, "completed navigate to displayType method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PhotoFrameStartTime(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to photoFrameStartTime");
		app.photoFrameStartTime();
		test.log(Status.INFO, "completed navigate to photoFrameStartTime method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Nightmodestart(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to nightmodestart");
		app.nightmodestart();
		test.log(Status.INFO, "completed navigate to nightmodestart method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Nightmodeend(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to nightmodeend");
		app.nightmodeend();
		test.log(Status.INFO, "completed navigate to nightmodeend method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AccountNumber(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to accountNumber");
		app.accountNumber();
		test.log(Status.INFO, "completed navigate to accountNumber method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Zwave(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to Zwave");
		app.zwave();
		test.log(Status.INFO, "completed navigate to Zwave method");
		app.sameSetting();app.settingvalidator();
	}
	
	@Test
	public void PowerManagement(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to powerManagement");
		app.powerManagement();
		test.log(Status.INFO, "completed navigate to powerManagement method");
		app.sameSetting();app.settingvalidator();
	}
	
	@Test
	public void SIAPowerRestoration(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sIAPowerRestoration");
		app.sIAPowerRestoration();
		test.log(Status.INFO, "completed navigate to sIAPowerRestoration method");
		app.sameSetting();app.settingvalidator();
	}
	
	@Test
	public void SensorLowBatteryTroubleBeep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorLowBatteryTroubleBeep");
		app.sensorLowBatteryTroubleBeep();
		test.log(Status.INFO, "completed navigate to sensorLowBatteryTroubleBeep method");
		app.sameSetting();app.settingvalidator();
	}
	
	@Test
	public void SensorTamperTroubleBeep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorTamperTroubleBeep");
		app.sensorTamperTroubleBeep();
		test.log(Status.INFO, "completed navigate to sensorTamperTroubleBeep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void TroubleBeepsTimeout(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to troubleBeepsTimeout");
		app.troubleBeepsTimeout();
		test.log(Status.INFO, "completed navigate to troubleBeepsTimeout method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AutoExitTimeExtension(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to autoExitTimeExtension");
		app.autoExitTimeExtension();
		test.log(Status.INFO, "completed navigate to autoExitTimeExtension method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ThermostatDevice(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to thermostatDevice");
		app.thermostatDevice();
		test.log(Status.INFO, "completed navigate to thermostatDevice method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LockDevices(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to lockDevices");
		app.lockDevices();
		test.log(Status.INFO, "completed navigate to lockDevices method");
		app.sameSetting();app.settingvalidator();
	}
	
	@Test
	public void DimmerDevices(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to dimmerDevices");
		app.dimmerDevices();
		test.log(Status.INFO, "completed navigate to dimmerDevices method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LogLevel(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to logLevel");
		app.logLevel();
		test.log(Status.INFO, "completed navigate to logLevel method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MasterCodeZwave(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to masterCodeZwave");
		app.masterCodeZwave();
		test.log(Status.INFO, "completed navigate to masterCodeZwave method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void FireVerification(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to fireVerification");
		app.fireVerification();
		test.log(Status.INFO, "completed navigate to fireVerification method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void DisarmPhotos(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorLowBatteryTroubleBeep");
		app.sensorLowBatteryTroubleBeep();
		test.log(Status.INFO, "completed navigate to sensorLowBatteryTroubleBeep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SevereWeatherSirenWarning(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to severeWeatherSirenWarning");
		app.severeWeatherSirenWarning();
		test.log(Status.INFO, "completed navigate to severeWeatherSirenWarning method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SecureDeleteImages(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to secureDeleteImages");
		app.secureDeleteImages();
		test.log(Status.INFO, "completed navigate to secureDeleteImages method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MastercodeSirenAndAlarm(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to mastercodeSirenAndAlarm");
		app.mastercodeSirenAndAlarm();
		test.log(Status.INFO, "completed navigate to mastercodeSirenAndAlarm method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MastercodeSecurityandArming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to mastercodeSecurityandArming");
		app.mastercodeSecurityandArming();
		test.log(Status.INFO, "completed navigate to mastercodeSecurityandArming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MastercodeCameraSettings(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to mastercodeCameraSettings");
		app.mastercodeCameraSettings();
		test.log(Status.INFO, "completed navigate to mastercodeCameraSettings method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MastercodeZwaveManagement(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to mastercodeZwaveManagement");
		app.mastercodeZwaveManagement();
		test.log(Status.INFO, "completed navigate to mastercodeZwaveManagement method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AlarmPhotos(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to alarmPhotos");
		app.alarmPhotos();
		test.log(Status.INFO, "completed navigate to alarmPhotos method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AllTroubleBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to allTroubleBeeps");
		app.allTroubleBeeps();
		test.log(Status.INFO, "completed navigate to allTroubleBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelTamperTroubleBeep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelTamperTroubleBeep");
		app.panelTamperTroubleBeep();
		test.log(Status.INFO, "completed navigate to panelTamperTroubleBeep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LongEntryDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to longEntryDelay");
		app.longEntryDelay();
		test.log(Status.INFO, "completed navigate to longEntryDelay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LongExitDelay(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to longExitDelay");
		app.longExitDelay();
		test.log(Status.INFO, "completed navigate to longExitDelay method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LocalZWaveVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to localZWaveVoicePrompts");
		app.localZWaveVoicePrompts();
		test.log(Status.INFO, "completed navigate to localZWaveVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void RemoteZWaveVoicePrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to remoteZWaveVoicePrompts");
		app.remoteZWaveVoicePrompts();
		test.log(Status.INFO, "completed navigate to remoteZWaveVoicePrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SupervisoryEmergency(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to supervisoryEmergency");
		app.supervisoryEmergency();
		test.log(Status.INFO, "completed navigate to supervisoryEmergency method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SirenAnnunciation(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sirenAnnunciation");
		app.sirenAnnunciation();
		test.log(Status.INFO, "completed navigate to sirenAnnunciation method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WellnessSupport(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to secureDeleteImages");
		app.secureDeleteImages();
		test.log(Status.INFO, "completed navigate to secureDeleteImages method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WaterFreezeSiren(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to waterFreezeSiren");
		app.waterFreezeSiren();
		test.log(Status.INFO, "completed navigate to WaterFreezeSiren method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void RFJamDetectionAlarm(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to rFJamDetectionAlarm");
		app.rFJamDetectionAlarm();
		test.log(Status.INFO, "completed navigate to rFJamDetectionAlarm method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void OtherZWaveDeviceLimit(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to otherZWaveDeviceLimit");
		app.otherZWaveDeviceLimit();
		test.log(Status.INFO, "completed navigate to otherZWaveDeviceLimit method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void RFJamDetection(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to rFJamDetection");
		app.rFJamDetection();
		test.log(Status.INFO, "completed navigate to rFJamDetection method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void RFJamSensitivityLevel(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to rFJamSensitivityLevel");
		app.rFJamSensitivityLevel();
		test.log(Status.INFO, "completed navigate to rFJamSensitivityLevel method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AllowKeyfobAlarmDisarm(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to allowKeyfobAlarmDisarm");
		app.allowKeyfobAlarmDisarm();
		test.log(Status.INFO, "completed navigate to allowKeyfobAlarmDisarm method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Panelcommunicationtestfrequency(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelcommunicationtestfrequency");
		app.panelcommunicationtestfrequency();
		test.log(Status.INFO, "completed navigate to panelcommunicationtestfrequency method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Policepanic(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to policepanic");
		app.policepanic();
		test.log(Status.INFO, "completed navigate to policepanic method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Firepanic(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to firepanic");
		app.firepanic();
		test.log(Status.INFO, "completed navigate to firepanic method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Auxiliarypanic(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to auxiliarypanic");
		app.auxiliarypanic();
		test.log(Status.INFO, "completed navigate to auxiliarypanic method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void KeyfobDisarming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to keyfobDisarming");
		app.keyfobDisarming();
		test.log(Status.INFO, "completed navigate to keyfobDisarming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void VoicesVolume(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to voicesVolume");
		app.voicesVolume();
		test.log(Status.INFO, "completed navigate to voicesVolume method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BeepsandChimesvolume(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to beepsandChimesvolume");
		app.beepsandChimesvolume();
		test.log(Status.INFO, "completed navigate to beepsandChimesvolume method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BluetoothDisarm(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to bluetoothDisarm");
		app.bluetoothDisarm();
		test.log(Status.INFO, "completed navigate to bluetoothDisarm method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BluetoothDisarmTimeout(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to bluetoothDisarmTimeout");
		app.bluetoothDisarmTimeout();
		test.log(Status.INFO, "completed navigate to bluetoothDisarmTimeout method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void TouchSounds(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to touchSounds");
		app.touchSounds();
		test.log(Status.INFO, "completed navigate to touchSounds method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void FontSize(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to fontSize");
		app.fontSize();
		test.log(Status.INFO, "completed navigate to fontSize method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Bluetooth(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to bluetooth");
		app.bluetooth();
		test.log(Status.INFO, "completed navigate to bluetooth method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SettingPhotos(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to settingPhotos");
		app.settingPhotos();
		test.log(Status.INFO, "completed navigate to settingPhotos method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void GarageDoorDeviceLimit(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to garageDoorDeviceLimit");
		app.garageDoorDeviceLimit();
		test.log(Status.INFO, "completed navigate to garageDoorDeviceLimit method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void FireandLifeSafetyDeviceTroubleBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to fireandLifeSafetyDeviceTroubleBeeps");
		app.fireandLifeSafetyDeviceTroubleBeeps();
		test.log(Status.INFO, "completed navigate to fireandLifeSafetyDeviceTroubleBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SensorTamperTroubleBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorTamperTroubleBeeps");
		app.sensorTamperTroubleBeeps();
		test.log(Status.INFO, "completed navigate to sensorTamperTroubleBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelTamperBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelTamperBeeps");
		app.panelTamperBeeps();
		test.log(Status.INFO, "completed navigate to panelTamperBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SensorLowBatteryBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorLowBatteryBeeps");
		app.sensorLowBatteryBeeps();
		test.log(Status.INFO, "completed navigate to sensorLowBatteryBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelTamper(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelTamper");
		app.panelTamper();
		test.log(Status.INFO, "completed navigate to panelTamper method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelGlassBreakSensor(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelGlassBreakSensor");
		app.panelGlassBreakSensor();
		test.log(Status.INFO, "completed navigate to panelGlassBreakSensor method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelGlassBreakSensorSensitivity(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelGlassBreakSensorSensitivity");
		app.panelGlassBreakSensorSensitivity();
		test.log(Status.INFO, "completed navigate to panelGlassBreakSensorSensitivity method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SafetySensorSounds(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to SafetySensorSounds");
		app.safetySensorSounds();
		test.log(Status.INFO, "completed navigate to safetySensorSounds method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SwingerShutdown(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to swingerShutdown");
		app.swingerShutdown();
		test.log(Status.INFO, "completed navigate to swingerShutdown method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SwingerShutdownTripCount(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to swingerShutdownTripCount");
		app.swingerShutdownTripCount();
		test.log(Status.INFO, "completed navigate to swingerShutdownTripCount method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void MasterUserAddSensors(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to masterUserAddSensors");
		app.masterUserAddSensors();
		test.log(Status.INFO, "completed navigate to masterUserAddSensors method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void NightTimeModeSetting(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to nightTimeModeSetting");
		app.nightTimeModeSetting();
		test.log(Status.INFO, "completed navigate to nightTimeModeSetting method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SensorAutoLearnOpenCloseReports(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sensorAutoLearnOpenCloseReports");
		app.sensorAutoLearnOpenCloseReports();
		test.log(Status.INFO, "completed navigate to sensorAutoLearnOpenCloseReports method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelWiFiConnectivityWarningPrompts(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelWiFiConnectivityWarningPrompts");
		app.panelWiFiConnectivityWarningPrompts();
		test.log(Status.INFO, "completed navigate to panelWiFiConnectivityWarningPrompts method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void panelCameraMotionDetector(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelCameraMotionDetector");
		app.panelCameraMotionDetector();
		test.log(Status.INFO, "completed navigate to panelCameraMotionDetector method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ZWavePrimaryController(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to zWavePrimaryController");
		app.zWavePrimaryController();
		test.log(Status.INFO, "completed navigate to zWavePrimaryController method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BackgroundDownloadforUpdates(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to backgroundDownloadforUpdates");
		app.backgroundDownloadforUpdates();
		test.log(Status.INFO, "completed navigate to backgroundDownloadforUpdates method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SoftwareUpdateCheckInterval(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to softwareUpdateCheckInterval");
		app.softwareUpdateCheckInterval();
		test.log(Status.INFO, "completed navigate to softwareUpdateCheckInterval method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ManageMyHome(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to ManageMyHome");
		app.manageMyHome();
		test.log(Status.INFO, "completed navigate to ManageMyHome method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Partitions(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to Partitions");
		app.partitions();
		test.log(Status.INFO, "completed navigate to partitions method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Digit6UserCodes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to digit6UserCodes");
		app.digit6UserCodes();
		test.log(Status.INFO, "completed navigate to digit6UserCodes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void UseCommercialSensorandDeviceNames(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to useCommercialSensorandDeviceNames");
		app.useCommercialSensorandDeviceNames();
		test.log(Status.INFO, "completed navigate to useCommercialSensorandDeviceNames method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizSoftwareUpdateStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizSoftwareUpdateStep");
		app.wizSoftwareUpdateStep();
		test.log(Status.INFO, "completed navigate to wizSoftwareUpdateStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizSecuritySensorsStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizSecuritySensorsStep");
		app.wizSecuritySensorsStep();
		test.log(Status.INFO, "completed navigate to wizSecuritySensorsStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizPanelGlassBreakStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizPanelGlassBreakStep");
		app.wizPanelGlassBreakStep();
		test.log(Status.INFO, "completed navigate to wizPanelGlassBreakStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizZWaveDevicesStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizZWaveDevicesStep");
		app.wizZWaveDevicesStep();
		test.log(Status.INFO, "completed navigate to wizZWaveDevicesStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizBluetoothDevicesStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizBluetoothDevicesStep");
		app.wizBluetoothDevicesStep();
		test.log(Status.INFO, "completed navigate to wizBluetoothDevicesStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizUsersStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizUsersStep");
		app.wizUsersStep();
		test.log(Status.INFO, "completed navigate to wizUsersStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizDealerStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizDealerStep");
		app.wizDealerStep();
		test.log(Status.INFO, "completed navigate to wizDealerStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizSecuritySensorSetupType(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizSecuritySensorSetupType");
		app.wizSecuritySensorSetupType();
		test.log(Status.INFO, "completed navigate to wizSecuritySensorSetupType method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void GlobalFireSiren(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to globalFireSiren");
		app.globalFireSiren();
		test.log(Status.INFO, "completed navigate to globalFireSiren method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AlarmVideos(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to alarmVideos");
		app.alarmVideos();
		test.log(Status.INFO, "completed navigate to alarmVideos method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SecondPreferredLanguage(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to secondPreferredLanguage");
		app.secondPreferredLanguage();
		test.log(Status.INFO, "completed navigate to secondPreferredLanguage method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizIQRemoteStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizIQRemoteStep");
		app.wizIQRemoteStep();
		test.log(Status.INFO, "completed navigate to wizIQRemoteStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WizSensorTestStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wizSecuritySensorsStep");
		app.wizSecuritySensorsStep();
		test.log(Status.INFO, "completed navigate to wizSecuritySensorsStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LockScreen(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to lockScreen");
		app.lockScreen();
		test.log(Status.INFO, "completed navigate to lockScreen method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ExitBeeps(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to exitBeeps");
		app.exitBeeps();
		test.log(Status.INFO, "completed navigate to exitBeeps method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void TimeFormat(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to timeFormat");
		app.timeFormat();
		test.log(Status.INFO, "completed navigate to timeFormat method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ScenesSupport(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to scenesSupport");
		app.scenesSupport();
		test.log(Status.INFO, "completed navigate to scenesSupport method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void WellnessPage(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to wellnessPage");
		app.wellnessPage();
		test.log(Status.INFO, "completed navigate to wellnessPage method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void CheckInCheckOut(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to secondPreferredLanguage");
		app.checkInCheckOut();
		test.log(Status.INFO, "completed navigate to checkInCheckOut method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SecurityPage(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to securityPage");
		app.securityPage();
		test.log(Status.INFO, "completed navigate to securityPage method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void StreamLiveVideoCamerastoIQRemote(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to streamLiveVideoCamerastoIQRemote");
		app.streamLiveVideoCamerastoIQRemote();
		test.log(Status.INFO, "completed navigate to streamLiveVideoCamerastoIQRemote method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void GlobalChimesandVoices(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to globalChimesandVoices");
		app.globalChimesandVoices();
		test.log(Status.INFO, "completed navigate to globalChimesandVoices method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void GlobalIntrusionSoundsandSirens(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to globalIntrusionSoundsandSirens");
		app.globalIntrusionSoundsandSirens();
		test.log(Status.INFO, "completed navigate to globalIntrusionSoundsandSirens method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void GlobalAuxiliarySirens(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to globalAuxiliarySirens");
		app.globalAuxiliarySirens();
		test.log(Status.INFO, "completed navigate to globalAuxiliarySirens method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AllSoundsinPartition1(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to allSoundsinPartition1");
		app.allSoundsinPartition1();
		test.log(Status.INFO, "completed navigate to allSoundsinPartition1 method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PowerGLossofSupervisoryforNonEmergencySensors(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to powerGLossofSupervisoryforNonEmergencySensors");
		app.powerGLossofSupervisoryforNonEmergencySensors();
		test.log(Status.INFO, "completed navigate to powerGLossofSupervisoryforNonEmergencySensors method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PowerGLossofSupervisoryforEmergencySensors(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to powerGLossofSupervisoryforEmergencySensors");
		app.powerGLossofSupervisoryforEmergencySensors();
		test.log(Status.INFO, "completed navigate to powerGLossofSupervisoryforEmergencySensors method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelCamera(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelCamera");
		app.panelCamera();
		test.log(Status.INFO, "completed navigate to panelCamera method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void Engrade2(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to engrade2");
		app.engrade2();
		test.log(Status.INFO, "completed navigate to engrade2 method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PowerGRFJam(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to powerGRFJam");
		app.powerGRFJam();
		test.log(Status.INFO, "completed navigate to powerGRFJam method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void InstallerAccessRequiresUserPermission(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to installerAccessRequiresUserPermission");
		app.installerAccessRequiresUserPermission();
		test.log(Status.INFO, "completed navigate to installerAccessRequiresUserPermission method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PowerGSmokeDetectorSiren(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to powerGSmokeDetectorSiren");
		app.powerGSmokeDetectorSiren();
		test.log(Status.INFO, "completed navigate to powerGSmokeDetectorSiren method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void EUEventSwingerShutdownCount(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to eUEventSwingerShutdownCount");
		app.eUEventSwingerShutdownCount();
		test.log(Status.INFO, "completed navigate to eUEventSwingerShutdownCount method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void LEDIndicator(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to lEDIndicator");
		app.lEDIndicator();
		test.log(Status.INFO, "completed navigate to lEDIndicator method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void PanelAmbientNoiseDetector_BETA(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to panelAmbientNoiseDetector_BETA");
		app.panelAmbientNoiseDetector_BETA();
		test.log(Status.INFO, "completed navigate to panelAmbientNoiseDetector_BETA method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void DownloadMobileAppStep(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to downloadMobileAppStep");
		app.downloadMobileAppStep();
		test.log(Status.INFO, "completed navigate to downloadMobileAppStep method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void StreamSolarData(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to streamSolarData");
		app.streamSolarData();
		test.log(Status.INFO, "completed navigate to streamSolarData method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void ULCCommercialPowerRestoration(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to uLCCommercialPowerRestoration");
		app.uLCCommercialPowerRestoration();
		test.log(Status.INFO, "completed navigate to uLCCommercialPowerRestoration method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AutoCommunicationTestStartTime(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to autoCommunicationTestStartTime");
		app.autoCommunicationTestStartTime();
		test.log(Status.INFO, "completed navigate to autoCommunicationTestStartTime method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void EngineersReset(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to engineersReset");
		app.engineersReset();
		test.log(Status.INFO, "completed navigate to engineersReset method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void SirenforWirelessSupervisoryFailures(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to sirenforWirelessSupervisoryFailures");
		app.sirenforWirelessSupervisoryFailures();
		test.log(Status.INFO, "completed navigate to sirenforWirelessSupervisoryFailures method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BurglaryAlarmConfirmation(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to burglaryAlarmConfirmation");
		app.burglaryAlarmConfirmation();
		test.log(Status.INFO, "completed navigate to burglaryAlarmConfirmation method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void BurglaryAlarmConfirmationTimer_minutes(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to burglaryAlarmConfirmationTimer_minutes");
		app.burglaryAlarmConfirmationTimer_minutes();
		test.log(Status.INFO, "completed navigate to burglaryAlarmConfirmationTimer_minutes method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void IQRemoteResetAuthentication(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to iQRemoteResetAuthentication");
		app.iQRemoteResetAuthentication();
		test.log(Status.INFO, "completed navigate to iQRemoteResetAuthentication method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void UKFinalExitDoorArming(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to uKFinalExitDoorArming");
		app.uKFinalExitDoorArming();
		test.log(Status.INFO, "completed navigate to uKFinalExitDoorArming method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void AmbientNoiseDetectiondBThreshold(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to ambientNoiseDetectiondBThreshold");
		app.ambientNoiseDetectiondBThreshold();
		test.log(Status.INFO, "completed navigate to ambientNoiseDetectiondBThreshold method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void NoiseDetectorDuration(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to noiseDetectorDuration");
		app.noiseDetectorDuration();
		test.log(Status.INFO, "completed navigate to noiseDetectorDuration method");
		app.sameSetting();app.settingvalidator();
	}
	@Test
	public void NoiseDetectorPopup(ITestContext context) throws Exception {
		test.log(Status.INFO, "Navigate to noiseDetectorPopup");
		app.noiseDetectorPopup();
		test.log(Status.INFO, "completed navigate to noiseDetectorPopup method");
		app.sameSetting();app.settingvalidator();
	}
}
