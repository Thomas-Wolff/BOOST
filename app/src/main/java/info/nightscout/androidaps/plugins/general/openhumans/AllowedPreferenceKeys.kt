package info.nightscout.androidaps.plugins.general.openhumans

import java.util.*

fun String.isAllowedKey() = if (startsWith("ConfigBuilder_")) true else allowedKeys.contains(this.toUpperCase(Locale.ROOT))

private val allowedKeys = """
    absorption
    absorption_maxtime
    openapsama_autosens_period
    autosens_max
    autosens_min
    absorption
    openapsama_min_5m_carbimpact
    absorption_cutoff
    autosens_max
    autosens_min
    absorption
    openapsama_min_5m_carbimpact
    absorption_cutoff
    autosens_max
    autosens_min
    age
    location
    dexcomg5_nsupload
    dexcomg5_xdripupload
    dexcom_lognssensorchange
    danars_bolusspeed
    danar_useextended
    danar_visualizeextendedaspercentage"
    bt_watchdog
    danar_useextended
    danar_visualizeextendedaspercentage"
    bt_watchdog
    DanaRProfile
    danarprofile_dia
    blescannner
    danars_bolusspeed
    bt_watchdog
    danars_bolusspeed
    bt_watchdog
    enable_fabric
    insight_log_reservoir_changes
    insight_log_tube_changes
    insight_log_site_changes
    insight_log_battery_changes
    insight_log_operating_mode_changes
    insight_log_alerts
    insight_enable_tbr_emulation
    insight_min_recovery_duration
    insight_max_recovery_duration
    insight_disconnect_delay
    insight_log_reservoir_changes
    insight_log_tube_changes
    insight_log_site_changes
    insight_log_battery_changes
    insight_log_operating_mode_changes
    insight_log_alerts
    insight_enable_tbr_emulation
    insight_min_recovery_duration
    insight_max_recovery_duration
    insight_disconnect_delay
    InsulinOrefFreePeak
    insulin_oref_peak
    language
    aps_general
    aps_mode
    loop_openmode_min_change
    maintenance
    maintenance_logs_amount
    pref_medtronic_pump_type
    pref_medtronic_frequency
    pref_medtronic_max_basal
    pref_medtronic_max_bolus
    pref_medtronic_bolus_delay
    pref_medtronic_encoding
    pref_medtronic_battery_type
    pref_medtronic_bolus_debug
    ns_logappstartedevent
    nsalarm_urgent_high
    nsalarm_high
    nsalarm_low
    nsalarm_urgent_low
    nsalarm_staledata
    nsalarm_staledatavalue
    nsalarm_urgent_staledata
    nsalarm_urgent_staledatavalue
    ns_wifionly
    ns_wifi_ssids
    ns_allowroaming
    ns_chargingonly
    ns_autobackfill
    ns_create_announcements_from_errors
    nsclient_localbroadcasts
    ns_upload_only
    ns_noupload
    ns_sync_use_absolute
    openapsama
    openapsma_max_basal
    openapsma_max_iob
    openapsama_useautosens
    autosens_adjust_targets
    openapsama_min_5m_carbimpact
    always_use_shortavg
    openapsama_max_daily_safety_multiplier
    openapsama_current_basal_safety_multiplier
    bolussnooze_dia_divisor
    openaps
    openapsma_max_basal
    openapsma_max_iob
    always_use_shortavg
    bolussnooze_dia_divisor
    openapssmb
    EN
    AIMI
    AIMI
    Boost
    openapsma_max_basal
    openapsmb_max_iob
    openapsama_useautosens
    use_smb
    enableSMB_with_COB
    enableSMB_with_temptarget
    enableSMB_with_high_temptarget
    enableSMB_always
    enableSMB_after_carbs
    smbmaxminutes
    use_uam
    high_temptarget_raises_sensitivity
    low_temptarget_lowers_sensitivity
    always_use_shortavg
    openapsama_max_daily_safety_multiplier
    openapsama_current_basal_safety_multiplier
    others
    eatingsoon_duration
    eatingsoon_target
    activity_duration
    activity_target
    hypo_duration
    hypo_target
    fill_button1
    fill_button2
    fill_button3
    low_mark
    high_mark
    short_tabtitles
    enable_missed_bg_readings
    missed_bg_readings_threshold
    enable_pump_unreachable_alert
    raise_urgent_alarms_as_android_notification
    keep_screen_on
    show_treatment_button
    show_wizard_button
    show_insulin_button
    insulin_button_increment_1
    insulin_button_increment_2
    insulin_button_increment_3
    show_carbs_button
    carbs_button_increment_1
    carbs_button_increment_2
    carbs_button_increment_3
    show_cgm_button
    show_calibration_button
    show_notes_entry_dialogs
    quickwizard
    key_advancedsettings
    boluswizard_percentage
    key_usersuperbolus
    key_show_statuslights
    key_show_statuslights_extended
    key_statuslights_res_warning
    key_statuslights_res_critical
    key_statuslights_bat_warning
    key_statuslights_bat_critical
    dexcomg5_nsupload
    dexcomg5_xdripupload
    treatmentssafety
    treatmentssafety_maxbolus
    treatmentssafety_maxcarbs
    smscommunicator
    smscommunicator_remotecommandsallowed
    tidepool_upload_screen
    tidepool_upload_cgm
    tidepool_upload_bolus
    tidepool_upload_bg
    tidepool_upload_tbr
    tidepool_upload_profile
    tidepool_dev_servers
    tidepool_only_while_charging
    tidepool_only_while_unmetered
    virtualpump
    key_virtualpump_uploadstatus
    virtualpump_type
    wearplugin
    wearcontrol
    wearplugin
    wearwizard_bg
    wearwizard_tt
    wearwizard_trend
    wearwizard_cob
    wearwizard_bolusiob
    wearwizard_basaliob
    wearplugin
    wear_detailediob
    wear_detailed_delta
    wear_showbgi
    wear_predictions
    wearplugin
    wear_notifySMB
    xdripstatus
    xdripstatus_detailediob
    xdripstatus_showbgi
""".trimIndent().split("\n").filterNot { it.isBlank() }.map { it.toUpperCase() }