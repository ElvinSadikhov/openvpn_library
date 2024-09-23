package de.blinkt.openvpn;

public interface OnVPNSettingsStatusTempListener {
      void onGotVpnStatus(Boolean isAlwaysOn, Boolean isLockdownEnabled);
}