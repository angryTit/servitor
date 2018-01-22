package ru.angrytit.servitor.process;

/**
 * Created by Mikhail Tyamin
 */
public enum ProcessOutputConst {

    PS_AX_OUTPUT_WITH_ONE_ACTIVE_HAPROXY("  PID   TT  STAT      TIME COMMAND\n" +
            "    1   ??  Ss     5:44.13 /sbin/launchd\n" +
            "   44   ??  Ss     0:54.48 /usr/libexec/UserEventAgent (System)\n" +
            "   45   ??  Us     0:26.89 /usr/sbin/syslogd\n" +
            "   47   ??  Ss     5:10.43 /Library/Yota/Yota Access//YotaAccessService.app/Contents/MacOS/YotaAccessService\n" +
            "   48   ??  Ss     0:02.27 /usr/libexec/kextd\n" +
            "   49   ??  Ss     1:08.15 /System/Library/Frameworks/CoreServices.framework/Versions/A/Frameworks/FSEvents.framework/Versions/A/Support/fseventsd\n" +
            "   52   ??  Ss     0:08.67 /opt/cisco/anyconnect/bin/vpnagentd -execv_instance\n" +
            "   53   ??  Ss     0:01.25 /usr/libexec/thermald\n" +
            "   55   ??  Ss     0:00.68 /System/Library/CoreServices/appleeventsd --server\n" +
            "   56   ??  Ss     0:17.65 /usr/libexec/configd\n" +
            "   57   ??  Ss    11:43.90 /Library/Frameworks/eToken.framework/Versions/Current/eTSrv\n" +
            "   58   ??  Ss     0:07.64 /System/Library/CoreServices/powerd.bundle/powerd\n" +
            "   61   ??  Ss     0:12.37 /usr/libexec/airportd\n" +
            "   63   ??  SNs    0:00.61 /usr/libexec/warmd\n" +
            "   64   ??  Ss     5:42.50 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Support/mds\n" +
            "   68   ??  Ss     0:00.55 /System/Library/CoreServices/iconservicesd\n" +
            "   70   ??  Ss     0:00.44 /usr/libexec/diskarbitrationd\n" +
            "   73   ??  Ss     0:46.57 /usr/libexec/coreduetd\n" +
            "   76   ??  Ss     0:00.37 /System/Library/PrivateFrameworks/WirelessDiagnostics.framework/Support/awdd\n" +
            "   77   ??  Ss     0:55.73 /usr/libexec/opendirectoryd\n" +
            "   78   ??  Ss     0:05.70 /usr/sbin/wirelessproxd\n" +
            "   80   ??  Ss     1:08.73 /usr/libexec/discoveryd --udsocket standard --loglevel Basic --logclass Everything --logto asl\n" +
            "   81   ??  Ss     0:09.05 /System/Library/PrivateFrameworks/ApplePushService.framework/apsd\n" +
            "   82   ??  Us     0:37.42 /System/Library/CoreServices/launchservicesd\n" +
            "   83   ??  Ss     0:21.76 /System/Library/PrivateFrameworks/MobileDevice.framework/Versions/A/Resources/usbmuxd -launchd\n" +
            "   84   ??  Ss     0:12.93 /usr/sbin/securityd -i -s on\n" +
            "   86   ??  Ss     0:04.88 /usr/libexec/locationd\n" +
            "   89   ??  Ss     0:27.19 /usr/sbin/blued\n" +
            "   90   ??  Ss     0:00.05 autofsd\n" +
            "   96   ??  Ss     0:00.02 /usr/libexec/stackshot -t -O\n" +
            "   97   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/GenerationalStorage.framework/Versions/A/Support/revisiond\n" +
            "   98   ??  Ss     0:21.30 /System/Library/CoreServices/loginwindow.app/Contents/MacOS/loginwindow console\n" +
            "   99   ??  Ss     0:00.08 /System/Library/CoreServices/logind\n" +
            "  100   ??  Ss     0:00.02 /usr/sbin/KernelEventAgent\n" +
            "  102   ??  Ss     4:52.36 /usr/libexec/hidd\n" +
            "  103   ??  Ss     1:06.31 /usr/libexec/taskgated -s\n" +
            "  104   ??  Ss     1:10.55 /usr/sbin/notifyd\n" +
            "  106   ??  Ss     0:08.93 /usr/sbin/distnoted daemon\n" +
            "  108   ??  Ss     0:04.27 /usr/libexec/diagnosticd\n" +
            "  109   ??  Ss     1:44.65 /usr/sbin/cfprefsd daemon\n" +
            "  111   ??  Ss     0:02.24 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/authd.xpc/Contents/MacOS/authd\n" +
            "  122   ??  Ss     0:06.31 /System/Library/CoreServices/coreservicesd\n" +
            "  247   ??  Ss     0:00.09 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  249   ??  Ss     0:06.27 /System/Library/Frameworks/CryptoTokenKit.framework/ctkd -s\n" +
            "  251   ??  Us   114:47.08 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/CoreGraphics.framework/Resources/WindowServer -daemon\n" +
            "  276   ??  Ss     0:01.44 /usr/libexec/findmydeviced\n" +
            "  277   ??  Ss     0:00.74 /System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/CVMServer\n" +
            "  281   ??  Ss     0:00.17 /usr/libexec/nsurlstoraged\n" +
            "  282   ??  Ss     1:49.79 /usr/libexec/networkd\n" +
            "  283   ??  Ss     0:00.01 /usr/libexec/discoveryd_helper --loglevel Detailed --logclass Everything --logto asl\n" +
            "  284   ??  Ss     0:00.09 /usr/libexec/networkd_privileged\n" +
            "  288   ??  Ss     2:39.59 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  306   ??  Ss     0:00.56 /usr/libexec/nsurlsessiond --privileged\n" +
            "  307   ??  Ss     0:08.60 /usr/sbin/ntpd -c /private/etc/ntp-restrict.conf -n -g -p /var/run/ntpd.pid -f /var/db/ntp.drift\n" +
            "  309   ??  Ss     0:09.69 /usr/libexec/usbd\n" +
            "  311   ??  Ss     2:12.42 /System/Library/CryptoTokenKit/com.apple.ifdreader.slotd/Contents/MacOS/com.apple.ifdreader\n" +
            "  318   ??  Ss     3:52.81 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mds_stores\n" +
            "  319   ??  Ss     0:09.04 sysmond\n" +
            "  320   ??  Ss     0:00.13 /System/Library/PrivateFrameworks/AmbientDisplay.framework/Versions/A/XPCServices/com.apple.AmbientDisplayAgent.xpc/Contents/MacOS/com.apple.AmbientDisplayAgent\n" +
            "  329   ??  Ss     0:00.64 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/com.apple.CodeSigningHelper.xpc/Contents/MacOS/com.apple.CodeSigningHelper\n" +
            "  333   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/AccountPolicy.framework/XPCServices/com.apple.AccountPolicyHelper.xpc/Contents/MacOS/com.apple.AccountPolicyHelper\n" +
            "  334   ??  Ss     0:00.42 /usr/libexec/securityd_service\n" +
            "  335   ??  S      0:13.53 /usr/libexec/UserEventAgent (Aqua)\n" +
            "  337   ??  S      1:14.06 /usr/sbin/distnoted agent\n" +
            "  339   ??  S      0:34.31 /usr/sbin/cfprefsd agent\n" +
            "  342   ??  Ss     0:00.06 /usr/libexec/smd\n" +
            "  344   ??  S      0:08.60 /usr/sbin/usernoted\n" +
            "  345   ??  S      0:05.66 /usr/libexec/nsurlsessiond\n" +
            "  347   ??  S      0:08.70 /System/Library/PrivateFrameworks/CalendarAgent.framework/Executables/CalendarAgent\n" +
            "  349   ??  U      1:00.92 /usr/libexec/secinitd\n" +
            "  351   ??  S      0:02.42 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/Versions/A/Support/bird\n" +
            "  353   ??  S      0:00.13 /System/Library/PrivateFrameworks/AskPermission.framework/Versions/A/Resources/askpermissiond\n" +
            "  354   ??  S      0:01.22 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistorySyncHelper\n" +
            "  355   ??  S      0:00.48 /usr/libexec/fmfd\n" +
            "  358   ??  S      0:00.16 /usr/libexec/USBAgent\n" +
            "  359   ??  S      0:06.78 /System/Library/PrivateFrameworks/IDS.framework/identityservicesd.app/Contents/MacOS/identityservicesd\n" +
            "  360   ??  S      0:01.36 /usr/libexec/secd\n" +
            "  361   ??  S      0:01.44 /System/Library/PrivateFrameworks/TelephonyUtilities.framework/callservicesd\n" +
            "  362   ??  Ss     4:36.01 /usr/sbin/coreaudiod\n" +
            "  363   ??  Ss     0:02.47 /usr/libexec/watchdogd\n" +
            "  365   ??  S      0:04.15 /System/Library/CoreServices/AirPlayUIAgent.app/Contents/MacOS/AirPlayUIAgent --launchd\n" +
            "  367   ??  Ss     0:00.79 /usr/sbin/filecoordinationd\n" +
            "  368   ??  Ss     0:02.00 /usr/libexec/sandboxd -n PluginProcess -n \n" +
            "  369   ??  S      0:29.91 /System/Library/PrivateFrameworks/CloudKitDaemon.framework/Support/cloudd\n" +
            "  370   ??  Ss     0:01.62 /System/Library/PrivateFrameworks/CoreSymbolication.framework/coresymbolicationd\n" +
            "  371   ??  Ss     0:00.24 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd system\n" +
            "  372   ??  S      0:00.72 /System/Library/PrivateFrameworks/IMCore.framework/imagent.app/Contents/MacOS/imagent\n" +
            "  373   ??  S      0:00.18 /System/Library/PrivateFrameworks/IMDPersistence.framework/XPCServices/IMDPersistenceAgent.xpc/Contents/MacOS/IMDPersistenceAgent\n" +
            "  374   ??  U      0:02.82 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "  378   ??  Ss     0:39.94 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdated\n" +
            "  380   ??  Ss     0:00.22 /System/Library/PrivateFrameworks/SoftwareUpdate.framework/Resources/suhelperd\n" +
            "  382   ??  S      0:04.83 /usr/libexec/nsurlstoraged\n" +
            "  384   ??  S      0:00.11 /usr/sbin/pboard\n" +
            "  385   ??  Ss     0:01.24 /System/Library/PrivateFrameworks/CalendarAgent.framework/Versions/A/XPCServices/CalNCService.xpc/Contents/MacOS/CalNCService\n" +
            "  388   ??  S      0:08.30 /System/Library/Frameworks/Accounts.framework/Versions/A/Support/accountsd\n" +
            "  389   ??  S      0:17.76 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/ATS.framework/Support/fontd\n" +
            "  393   ??  S      0:00.66 /System/Library/CoreServices/pbs\n" +
            "  407   ??  S      0:00.18 /System/Library/Frameworks/Security.framework/Versions/A/Resources/CloudKeychainProxy.bundle/Contents/MacOS/CloudKeychainProxy\n" +
            "  415   ??  S      0:00.56 /System/Library/PrivateFrameworks/CloudPhotoServices.framework/Versions/A/Frameworks/CloudPhotoServicesConfiguration.framework/Versions/A/XPCServices/com.apple.CloudPhotosCon\n" +
            "  416   ??  Ss     0:33.95 /Library/CoreMediaIO/Plug-Ins/DAL/AppleCamera.plugin/Contents/Resources/AppleCameraAssistant\n" +
            "  417   ??  S      0:48.74 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Support/photolibraryd\n" +
            "  421   ??  Ss     0:00.57 /System/Library/PrivateFrameworks/PerformanceAnalysis.framework/XPCServices/com.apple.PerformanceAnalysis.animationperfd.xpc/Contents/MacOS/com.apple.PerformanceAnalysis.anim\n" +
            "  438   ??  Ss     0:01.77 /System/Library/PrivateFrameworks/CacheDelete.framework/deleted\n" +
            "  439   ??  Ss     0:00.48 /System/Library/CoreServices/backupd.bundle/Contents/Resources/TMCacheDelete\n" +
            "  497   ??  S      0:00.95 /usr/sbin/distnoted agent\n" +
            "  498   ??  S      0:09.17 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            "  576   ??  S      0:02.08 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            "  581   ??  Ss     0:18.99 /usr/libexec/systemstatsd\n" +
            "  605   ??  Ss     0:04.74 /usr/libexec/amfid\n" +
            "  698   ??  S      0:00.10 /System/Library/CoreServices/ScopedBookmarkAgent\n" +
            "  737   ??  Ss     0:00.64 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Frameworks/PhotoLibraryServices.framework/Versions/A/XPCServices/com.apple.photomoments.xpc/Content\n" +
            "  738   ??  S      0:01.44 /System/Library/CoreServices/cloudphotosd.app/Contents/MacOS/cloudphotosd\n" +
            "  752   ??  Ss     0:00.19 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/XPCServices/ContainerMetadataExtractor.xpc/Contents/MacOS/ContainerMetadataExtractor\n" +
            "  755   ??  S      0:01.77 /System/Library/PrivateFrameworks/GeoServices.framework/Versions/A/XPCServices/com.apple.geod.xpc/Contents/MacOS/com.apple.geod\n" +
            "  759   ??  S      1:08.58 /Applications/Microsoft Office 2011/Office/Microsoft Office Reminders.app/Contents/MacOS/Microsoft Office Reminders -psn_0_65552\n" +
            "  760   ??  S      1:34.16 /System/Library/CoreServices/Dock.app/Contents/MacOS/Dock\n" +
            "  762   ??  S      0:21.41 /System/Library/CoreServices/SystemUIServer.app/Contents/MacOS/SystemUIServer\n" +
            "  763   ??  S      2:03.38 /System/Library/CoreServices/Finder.app/Contents/MacOS/Finder\n" +
            "  766   ??  S      0:03.10 /System/Library/CoreServices/Spotlight.app/Contents/MacOS/Spotlight\n" +
            "  767   ??  S      0:01.77 /System/Library/CoreServices/iconservicesagent\n" +
            "  768   ??  S      0:14.09 /usr/libexec/sharingd\n" +
            "  769   ??  S      0:04.20 /usr/libexec/pkd\n" +
            "  770   ??  S      0:01.44 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeaccountd\n" +
            "  771   ??  Ss     0:00.85 /System/Library/CoreServices/Menu Extras/AirPort.menu/Contents/XPCServices/com.apple.wifi.proxy.xpc/Contents/MacOS/com.apple.wifi.proxy\n" +
            "  772   ??  S      0:01.69 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeassetd\n" +
            "  774   ??  S      0:01.43 /System/Library/PrivateFrameworks/ParsecUI.framework/Versions/A/Support/SpotlightNetHelper.app/Contents/MacOS/SpotlightNetHelper\n" +
            "  778   ??  S      0:07.64 /System/Library/CoreServices/lsuseractivityd\n" +
            "  780   ??  Ss     0:01.15 /System/Library/CoreServices/Dock.app/Contents/XPCServices/com.apple.dock.extra.xpc/Contents/MacOS/com.apple.dock.extra\n" +
            "  781   ??  S      0:00.54 /System/Library/PrivateFrameworks/MessagesKit.framework/Resources/soagent.app/Contents/MacOS/soagent\n" +
            "  782   ??  S      0:00.23 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistoryPluginHelper\n" +
            "  783   ??  S      0:01.68 /System/Library/CoreServices/AppleIDAuthAgent\n" +
            "  786   ??  S      3:34.43 /Applications/Microsoft Office 2011/Office/Microsoft Database Daemon.app/Contents/MacOS/Microsoft Database Daemon\n" +
            "  787   ??  S      0:00.76 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeuid.app/Contents/MacOS/storeuid\n" +
            "  788   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  790   ??  S      1:11.16 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  791   ??  S      0:00.42 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storedownloadd\n" +
            "  796   ??  S      0:00.06 /usr/libexec/spindump_agent\n" +
            "  798   ??  S      0:00.18 /System/Library/CoreServices/SocialPushAgent.app/Contents/MacOS/SocialPushAgent\n" +
            "  800   ??  S      0:00.40 /System/Library/CoreServices/Keychain Circle Notification.app/Contents/MacOS/Keychain Circle Notification\n" +
            "  803   ??  S      0:13.46 /System/Library/CoreServices/NotificationCenter.app/Contents/MacOS/NotificationCenter\n" +
            "  806   ??  S      0:00.43 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/MacOS/Watchdog\n" +
            "  809   ??  S      0:01.17 com.apple.photostream-agent\n" +
            "  810   ??  S      0:06.94 /System/Library/CoreServices/cloudpaird\n" +
            "  813   ??  S      1:10.25 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  814   ??  S      0:01.32 /System/Library/CoreServices/WiFiAgent.app/Contents/MacOS/WiFiAgent\n" +
            "  815   ??  S      0:01.93 /System/Library/CoreServices/diagnostics_agent\n" +
            "  823   ??  S      0:01.68 /System/Library/CoreServices/Menu Extras/TextInput.menu/Contents/SharedSupport/TISwitcher.app/Contents/MacOS/TISwitcher\n" +
            "  825   ??  S      0:00.18 /Applications/iTunes.app/Contents/MacOS/iTunesHelper.app/Contents/MacOS/iTunesHelper\n" +
            "  826   ??  Ss     0:00.07 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  827   ??  S     61:48.19 /Applications/Google Chrome.app/Contents/MacOS/Google Chrome\n" +
            "  834   ??  S      9:33.09 /Applications/Yota.app/Contents/MacOS/Yota /minimized\n" +
            "  838   ??  S      0:01.50 /Applications/Evernote.app/Contents/Library/LoginItems/EvernoteHelper.app/Contents/MacOS/EvernoteHelper\n" +
            "  839   ??  Ss     0:00.04 /System/Library/CoreServices/NotificationCenter.app/Contents/XPCServices/com.apple.notificationcenterui.WeatherSummary.xpc/Contents/MacOS/com.apple.notificationcenterui.Weath\n" +
            "  842   ??  S      0:00.45 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Framework.framework/Helpers/crashpad_handler --database=/Users/mikhailtyamin/Library/Application\n" +
            "  845   ??  S      0:00.05 /System/Library/PrivateFrameworks/StoreXPCServices.framework/Versions/A/XPCServices/com.apple.appstore.PluginXPCService.xpc/Contents/MacOS/com.apple.appstore.PluginXPCService\n" +
            "  847   ??  S      0:00.40 /System/Library/PrivateFrameworks/UniversalAccess.framework/Versions/A/Resources/universalAccessAuthWarn.app/Contents/MacOS/universalAccessAuthWarn launchd -s\n" +
            "  848   ??  S      0:09.06 /System/Library/Services/AppleSpell.service/Contents/MacOS/AppleSpell -psn_0_208947\n" +
            "  854   ??  S      0:00.07 /System/Library/PrivateFrameworks/DataDetectorsCore.framework/Versions/A/XPCServices/DataDetectorsDynamicData.xpc/Contents/MacOS/DataDetectorsDynamicData\n" +
            "  855   ??  S      0:00.22 /System/Library/Frameworks/InputMethodKit.framework/Versions/A/XPCServices/com.apple.InputMethodKit.UserDictionary.xpc/Contents/MacOS/com.apple.InputMethodKit.UserDictionary\n" +
            "  861   ??  Ss     0:00.13 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            "  862   ??  S      0:00.08 /System/Library/PrivateFrameworks/BookKit.framework/Versions/A/XPCServices/com.apple.BKAgentService.xpc/Contents/MacOS/com.apple.BKAgentService\n" +
            "  874   ??  S     26:30.33 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=gpu-process --channel=827.0.844825740 --su\n" +
            "  875   ??  Ss     0:08.77 /usr/sbin/spindump\n" +
            "  876   ??  Ss     0:00.07 /System/Library/CoreServices/CrashReporterSupportHelper server-init\n" +
            "  877   ??  Ss     0:08.10 /System/Library/CoreServices/SubmitDiagInfo server-init\n" +
            "  878   ??  Ss     0:04.51 /System/Library/Frameworks/VideoToolbox.framework/Versions/A/XPCServices/VTDecoderXPCService.xpc/Contents/MacOS/VTDecoderXPCService\n" +
            "  881   ??  S      0:00.30 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storelegacy\n" +
            "  891   ??  S      1:59.16 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  894   ??  S      0:22.16 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  902   ??  S      0:17.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  904   ??  S      0:05.46 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  905   ??  S      0:02.85 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  910   ??  S      0:03.70 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  911   ??  S      0:05.40 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  924   ??  S     29:28.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=ppapi --channel=827.17.1177654966 --ppapi-\n" +
            "  926   ??  S      0:01.32 /System/Library/PrivateFrameworks/InternetAccounts.framework/Versions/A/XPCServices/com.apple.internetaccounts.xpc/Contents/MacOS/com.apple.internetaccounts\n" +
            "  929   ??  S      0:00.45 /System/Library/PrivateFrameworks/CommerceKit.framework/Resources/LaterAgent.app/Contents/MacOS/LaterAgent\n" +
            "  932   ??  S      1:04.00 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  937   ??  S      1:02.77 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  974   ??  S      0:07.12 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  975   ??  S      6:10.30 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  978   ??  S      2:16.44 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  981   ??  S      2:04.13 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  992   ??  S      5:44.83 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  995   ??  S      0:56.73 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  997   ??  S     14:43.06 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            " 1017   ??  S      0:00.01 /System/Library/Frameworks/WebKit.framework/Frameworks/WebKitLegacy.framework/WebKitPluginAgent\n" +
            " 1045   ??  S      0:01.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            " 1082   ??  U     11:25.60 /Applications/Slack.app/Contents/MacOS/Slack\n" +
            " 1085   ??  S     10:32.32 /Applications/Microsoft Lync.app/Contents/MacOS/Microsoft Lync\n" +
            " 1088   ??  S      0:00.56 /Library/Application Support/Microsoft/MAU2.0/Microsoft AutoUpdate.app/Contents/MacOS/Microsoft AU Daemon.app/Contents/MacOS/Microsoft AU Daemon\n" +
            " 1089   ??  S      0:32.41 /Applications/Mailbox (Beta).app/Contents/MacOS/Mailbox (Beta)\n" +
            " 1093   ??  S     11:08.69 /Applications/Microsoft Office 2011/Microsoft Outlook.app/Contents/MacOS/Microsoft Outlook\n" +
            " 1094   ??  S      0:00.83 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/SpeechSynthesis.framework/Resources/com.apple.speech.speechsynthesisd\n" +
            " 1099   ??  Ss     0:00.05 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.SandboxHelper.xpc/Contents/MacOS/com.apple.audio.SandboxHelper\n" +
            " 1100   ??  Ss     0:00.08 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.ComponentHelper.xpc/Contents/MacOS/com.apple.audio.ComponentHelper\n" +
            " 1101   ??  Ss     0:00.31 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            " 1112   ??  S      0:05.57 /Applications/Microsoft Office 2011/Office/Microsoft Alerts Daemon.app/Contents/MacOS/Microsoft Alerts Daemon\n" +
            " 1123   ??  S      0:00.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            " 1200   ??  S      8:41.09 /Applications/Utilities/Terminal.app/Contents/MacOS/Terminal\n" +
            " 1287   ??  U    124:03.10 /Applications/IntelliJ IDEA 13.app/Contents/MacOS/idea\n" +
            " 1299   ??  S      0:10.95 /Applications/IntelliJ IDEA 13.app/Contents/bin/fsnotifier\n" +
            " 1631   ??  Ss     0:00.36 /System/Library/Frameworks/ApplicationServices.framework/Versions/A/Frameworks/HIServices.framework/Versions/A/XPCServices/com.apple.hiservices-xpcservice.xpc/Contents/MacOS/\n" +
            " 2238   ??  S      0:41.52 /Applications/Cisco/Cisco AnyConnect Secure Mobility Client.app/Contents/MacOS/Cisco AnyConnect Secure Mobility Client\n" +
            " 2250   ??  Z      0:00.00 (cscan)\n" +
            " 5502   ??  S      0:00.10 /System/Library/PrivateFrameworks/CommunicationsFilter.framework/CMFSyncAgent.app/Contents/MacOS/CMFSyncAgent\n" +
            " 5506   ??  Ss     0:00.04 /System/Library/Frameworks/CoreMediaIO.framework/Versions/A/XPCServices/com.apple.cmio.registerassistantservice.xpc/Contents/MacOS/com.apple.cmio.registerassistantservice\n" +
            " 5510   ??  S      0:00.08 /System/Library/PrivateFrameworks/ToneLibrary.framework/Versions/A/XPCServices/com.apple.tonelibraryd.xpc/Contents/MacOS/com.apple.tonelibraryd\n" +
            " 9438   ??  S     19:32.69 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "11518   ??  Ss     0:00.50 /System/Library/PrivateFrameworks/PackageKit.framework/Resources/installd\n" +
            "11519   ??  Ss     0:00.76 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdate_download_service\n" +
            "11520   ??  Ss     0:00.69 /System/Library/CoreServices/AssetCacheLocatorService\n" +
            "11521   ??  S      0:00.09 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "14544   ??  S      1:02.77 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "14752   ??  S      0:00.18 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/com.apple.sbd\n" +
            "14754   ??  S      0:00.39 /System/Library/PrivateFrameworks/CloudServices.framework/Versions/A/XPCServices/com.apple.lakitu.xpc/Contents/MacOS/com.apple.lakitu\n" +
            "14831   ??  S      0:21.23 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "18267   ??  S      0:00.33 /System/Library/CoreServices/mapspushd\n" +
            "18434   ??  S    111:03.89 /Applications/uTorrent.app/Contents/MacOS/uTorrent\n" +
            "21656   ??  S      0:00.15 /usr/libexec/loginitemregisterd\n" +
            "21839   ??  S      0:17.13 2BUA8C4S2C.com.agilebits.onepassword4-helper\n" +
            "21968   ??  S      0:00.16 /usr/bin/ssh-agent -l\n" +
            "22280   ??  S     13:36.43 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "23104   ??  S      0:00.33 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/EscrowSecurityAlert.app/Contents/MacOS/EscrowSecurityAlert\n" +
            "26022   ??  S      1:01.42 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "27574   ??  S     17:23.12 /Applications/Dropbox.app/Contents/MacOS/Dropbox /firstrunupdate 836\n" +
            "27603   ??  S      0:05.77 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27604   ??  S      0:23.06 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27608   ??  S      0:16.93 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27613   ??  Ss     0:02.16 /Applications/Dropbox.app/Contents/PlugIns/garcon.appex/Contents/MacOS/garcon\n" +
            "27624   ??  S      0:00.34 /System/Library/Image Capture/Support/Image Capture Extension.app/Contents/MacOS/Image Capture Extension\n" +
            "30057   ??  Ss     0:00.10 /usr/libexec/syspolicyd\n" +
            "35496   ??  SNs    0:00.03 /usr/libexec/periodic-wrapper daily\n" +
            "35498   ??  S      0:00.52 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbagent.app/Contents/MacOS/nbagent\n" +
            "35573   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbstated\n" +
            "48270   ??  S      0:07.28 /Applications/TextEdit.app/Contents/MacOS/TextEdit -psn_0_1511793\n" +
            "48273   ??  S      0:00.04 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/PrintCore.framework/Versions/A/printtool agent\n" +
            "48275   ??  Ss     0:01.35 /System/Library/Frameworks/AppKit.framework/Versions/C/XPCServices/com.apple.appkit.xpc.openAndSavePanelService.xpc/Contents/MacOS/com.apple.appkit.xpc.openAndSavePanelServic\n" +
            "48478   ??  S      0:00.03 /System/Library/PrivateFrameworks/HelpData.framework/Versions/A/Resources/helpd\n" +
            "48479   ??  S      6:46.17 /Applications/Skype.app/Contents/MacOS/Skype\n" +
            "48485   ??  S      0:02.12 /Library/Audio/Plug-Ins/HAL/EcammAudioLoader.plugin/Contents/Plugins/CallRecorder.plugin/Contents/Resources/CallRecorderAgent.app/Contents/MacOS/CallRecorderAgent C3456C2D-42\n" +
            "51626   ??  S      0:00.37 /System/Library/CoreServices/CoreServicesUIAgent.app/Contents/MacOS/CoreServicesUIAgent\n" +
            "53444   ??  S      0:05.94 /Applications/1Password 5.app/Contents/MacOS/1Password 5\n" +
            "62964   ??  SNs    0:00.01 /usr/libexec/periodic-wrapper weekly\n" +
            "63741   ??  S      0:07.97 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63760   ??  S      0:08.31 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63868   ??  S      0:08.27 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63869   ??  S      0:09.47 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "68362   ??  S      0:00.21 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "71707   ??  Ss     0:02.53 auditd -l\n" +
            "71763   ??  SNs    0:00.05 /usr/sbin/netbiosd\n" +
            "72904   ??  S      0:05.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "74745   ??  S      2:23.84 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82010   ??  S      0:06.58 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82815   ??  S      2:57.15 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "84834   ??  S      0:13.76 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/Resources/PKIMonitor.app/Contents/MacOS/PKIMonitor\n" +
            "84835   ??  Ss     0:11.47 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "84855   ??  S      0:04.68 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "88817   ??  S      0:15.16 /Applications/Microsoft Office 2011/Microsoft Word.app/Contents/MacOS/Microsoft Word -psn_0_2372163\n" +
            "90114   ??  S      0:15.35 /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -d64 -Djava.awt.headless=true -Didea.version==13.1.5 -Xmx512m -Dfile.encoding=UTF-8 -classpath /Appl\n" +
            "91431   ??  S      0:03.86 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "95155   ??  S      0:00.09 /System/Library/PrivateFrameworks/AOSKit.framework/Versions/A/XPCServices/com.apple.iCloudHelper.xpc/Contents/MacOS/com.apple.iCloudHelper\n" +
            "95156   ??  Ss     0:00.02 /usr/sbin/ocspd\n" +
            "95343   ??  Ss     0:00.02 haproxy -C /Users/mikhailtyamin/haproxy-config -f haproxy.cfg -D -p haproxy.pid\n" +
            "2442   ??  Ss     0:00.02 haproxy -C /Users/mikhailtyamin/haproxy-config -f haproxy.cfg -D -p haproxy.pid\n" +
            " 1202 s000  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1222 s000  S+     0:00.28 -bash\n" +
            " 1203 s001  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1208 s001  S+     0:00.02 -bash\n" +
            " 1204 s002  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1225 s002  S+     0:00.01 -bash\n" +
            " 1205 s003  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1228 s003  S+     0:00.01 -bash\n" +
            " 1206 s004  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1215 s004  S+     0:00.01 -bash\n" +
            " 1207 s005  Ss     0:00.02 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1210 s005  S      0:00.04 -bash\n" +
            "95375 s005  R+     0:00.00 ps ax\n" +
            "51432 s006  Us     0:00.13 login -pf mikhailtyamin\n" +
            "51433 s006  S+     0:00.17 -bash\n" +
            "56701 s007  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "56702 s007  S+     0:00.08 -bash\n" +
            "21932 s008  Ss     0:00.07 login -pf mikhailtyamin\n" +
            "21933 s008  S+     0:00.02 -bash\n" +
            "29904 s009  Ss     0:00.07 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "29905 s009  S+     0:00.05 -bash\n" +
            "74277 s010  Ss     0:00.09 login -pf mikhailtyamin\n" +
            "74278 s010  S+     0:00.25 -bash\n" +
            "90693 s011  Ss     0:00.16 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "90694 s011  S+     0:00.02 -bash"),


    NETSTAT_OUTPUT_WITH_NO_HAPROXY_ON_3306_PORT("Active Internet connections (servers and established)\n" +
            "Proto Recv-Q Send-Q Local Address               Foreign Address             State       PID/Program name   \n" +
            "tcp        0      0 0.0.0.0:22                  0.0.0.0:*                   LISTEN      2264/sshd           \n" +
            "tcp        0      0 127.0.0.1:25                0.0.0.0:*                   LISTEN      2296/sendmail       \n" +
            "tcp        0      0 0.0.0.0:7070                0.0.0.0:*                   LISTEN      2442/haproxy        \n" +
            "tcp        0      0 127.0.0.1:32000             0.0.0.0:*                   LISTEN      2059/java           \n" +
            "tcp        0      0 172.31.23.237:39010         54.231.241.144:3306           TIME_WAIT   -        \n" +
            "tcp        0      0 127.0.0.1:32000             127.0.0.1:31000             ESTABLISHED 2057/wrapper        \n" +
            "tcp        0      1 172.31.26.97:38312          172.31.3.156:3306           SYN_SENT    2442/haproxy        \n" +
            "tcp        0      0 172.31.26.97:48375          54.231.242.140:80           TIME_WAIT   -                   \n" +
            "tcp        0      1 172.31.26.97:51058          172.31.27.233:3306          SYN_SENT    2442/haproxy        \n" +
            "tcp        0   1024 172.31.26.97:22             91.210.4.1:60295            ESTABLISHED 2402/sshd           \n" +
            "tcp        0      1 172.31.26.97:44201          172.31.16.37:3306           SYN_SENT    2442/haproxy        \n" +
            "tcp        0      1 172.31.26.97:34816          172.31.12.131:3306          SYN_SENT    2442/haproxy        \n" +
            "tcp        0      0 :::8080                     :::*                        LISTEN      2059/java           \n" +
            "tcp        0      0 :::2000                     :::*                        LISTEN      2059/java           \n" +
            "tcp        0      0 :::22                       :::*                        LISTEN      2264/sshd           \n" +
            "tcp        0      0 ::ffff:172.31.26.97:51052   ::ffff:203.83.221.115:443   ESTABLISHED 2059/java           \n" +
            "tcp        0      0 ::ffff:127.0.0.1:31000      ::ffff:127.0.0.1:32000      ESTABLISHED 2059/java           \n" +
            "tcp        0      0 ::ffff:172.31.26.97:44397   ::ffff:203.83.221.71:443    ESTABLISHED 2059/java           \n" +
            "udp        0      0 0.0.0.0:50694               0.0.0.0:*                               2442/haproxy        \n" +
            "udp        0      0 0.0.0.0:68                  0.0.0.0:*                               1886/dhclient       \n" +
            "udp        0      0 172.31.26.97:123            0.0.0.0:*                               2281/ntpd           \n" +
            "udp        0      0 127.0.0.1:123               0.0.0.0:*                               2281/ntpd           \n" +
            "udp        0      0 0.0.0.0:123                 0.0.0.0:*                               2281/ntpd           \n" +
            "Active UNIX domain sockets (servers and established)\n" +
            "Proto RefCnt Flags       Type       State         I-Node PID/Program name    Path\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     10383  2442/haproxy        /var/lib/haproxy/stats.2441.tmp\n" +
            "unix  7      [ ]         DGRAM                    8802   1945/rsyslogd       /dev/log\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     7684   1/init              @/com/ubuntu/upstart\n" +
            "unix  2      [ ACC ]     SEQPACKET  LISTENING     7888   1402/udevd          @/org/kernel/udev/udevd\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     9182   2127/dbus-daemon    /var/run/dbus/system_bus_socket\n" +
            "unix  3      [ ]         STREAM     CONNECTED     9191   2127/dbus-daemon    /var/run/dbus/system_bus_socket\n" +
            "unix  3      [ ]         STREAM     CONNECTED     9190   1/init              \n" +
            "unix  3      [ ]         DGRAM                    7896   1402/udevd          \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9185   2127/dbus-daemon    \n" +
            "unix  2      [ ]         DGRAM                    9750   2296/sendmail       \n" +
            "unix  3      [ ]         STREAM     CONNECTED     10137  2402/sshd           \n" +
            "unix  2      [ ]         STREAM     CONNECTED     9039   2059/java           \n" +
            "unix  2      [ ]         DGRAM                    9672   2281/ntpd           \n" +
            "unix  2      [ ]         DGRAM                    10527  2448/sudo           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9897   2059/java           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9898   2059/java           \n" +
            "unix  3      [ ]         DGRAM                    7897   1402/udevd          \n" +
            "unix  2      [ ]         DGRAM                    9770   2303/sendmail: Queu \n" +
            "unix  2      [ ]         DGRAM                    10132  2402/sshd           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     10136  2404/sshd           \n" +
            "unix  2      [ ]         DGRAM                    9787   2311/crond          \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9186   2127/dbus-daemon"),


    NETSTAT_OUTPUT_WITH_ONE_HAPROXY_ON_3306_PORT("Active Internet connections (servers and established)\n" +
            "Proto Recv-Q Send-Q Local Address               Foreign Address             State       PID/Program name   \n" +
            "tcp        0      0 0.0.0.0:22                  0.0.0.0:*                   LISTEN      2264/sshd           \n" +
            "tcp        0      0 127.0.0.1:25                0.0.0.0:*                   LISTEN      2296/sendmail       \n" +
            "tcp        0      0 0.0.0.0:7070                0.0.0.0:*                   LISTEN      2442/haproxy        \n" +
            "tcp        0      0 127.0.0.1:32000             0.0.0.0:*                   LISTEN      2059/java           \n" +
            "tcp        0      0 0.0.0.0:3306                0.0.0.0:*                   LISTEN      2442/haproxy        \n" +
            "tcp        0      0 127.0.0.1:32000             127.0.0.1:31000             ESTABLISHED 2057/wrapper        \n" +
            "tcp        0      1 172.31.26.97:38312          172.31.3.156:3306           SYN_SENT    2442/haproxy        \n" +
            "tcp        0      0 172.31.26.97:48375          54.231.242.140:80           TIME_WAIT   -                   \n" +
            "tcp        0      1 172.31.26.97:51058          172.31.27.233:3306          SYN_SENT    2442/haproxy        \n" +
            "tcp        0   1024 172.31.26.97:22             91.210.4.1:60295            ESTABLISHED 2402/sshd           \n" +
            "tcp        0      1 172.31.26.97:44201          172.31.16.37:3306           SYN_SENT    2442/haproxy        \n" +
            "tcp        0      1 172.31.26.97:34816          172.31.12.131:3306          SYN_SENT    2442/haproxy        \n" +
            "tcp        0      0 :::8080                     :::*                        LISTEN      2059/java           \n" +
            "tcp        0      0 :::2000                     :::*                        LISTEN      2059/java           \n" +
            "tcp        0      0 :::22                       :::*                        LISTEN      2264/sshd           \n" +
            "tcp        0      0 ::ffff:172.31.26.97:51052   ::ffff:203.83.221.115:443   ESTABLISHED 2059/java           \n" +
            "tcp        0      0 ::ffff:127.0.0.1:31000      ::ffff:127.0.0.1:32000      ESTABLISHED 2059/java           \n" +
            "tcp        0      0 ::ffff:172.31.26.97:44397   ::ffff:203.83.221.71:443    ESTABLISHED 2059/java           \n" +
            "udp        0      0 0.0.0.0:50694               0.0.0.0:*                               2442/haproxy        \n" +
            "udp        0      0 0.0.0.0:68                  0.0.0.0:*                               1886/dhclient       \n" +
            "udp        0      0 172.31.26.97:123            0.0.0.0:*                               2281/ntpd           \n" +
            "udp        0      0 127.0.0.1:123               0.0.0.0:*                               2281/ntpd           \n" +
            "udp        0      0 0.0.0.0:123                 0.0.0.0:*                               2281/ntpd           \n" +
            "Active UNIX domain sockets (servers and established)\n" +
            "Proto RefCnt Flags       Type       State         I-Node PID/Program name    Path\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     10383  2442/haproxy        /var/lib/haproxy/stats.2441.tmp\n" +
            "unix  7      [ ]         DGRAM                    8802   1945/rsyslogd       /dev/log\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     7684   1/init              @/com/ubuntu/upstart\n" +
            "unix  2      [ ACC ]     SEQPACKET  LISTENING     7888   1402/udevd          @/org/kernel/udev/udevd\n" +
            "unix  2      [ ACC ]     STREAM     LISTENING     9182   2127/dbus-daemon    /var/run/dbus/system_bus_socket\n" +
            "unix  3      [ ]         STREAM     CONNECTED     9191   2127/dbus-daemon    /var/run/dbus/system_bus_socket\n" +
            "unix  3      [ ]         STREAM     CONNECTED     9190   1/init              \n" +
            "unix  3      [ ]         DGRAM                    7896   1402/udevd          \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9185   2127/dbus-daemon    \n" +
            "unix  2      [ ]         DGRAM                    9750   2296/sendmail       \n" +
            "unix  3      [ ]         STREAM     CONNECTED     10137  2402/sshd           \n" +
            "unix  2      [ ]         STREAM     CONNECTED     9039   2059/java           \n" +
            "unix  2      [ ]         DGRAM                    9672   2281/ntpd           \n" +
            "unix  2      [ ]         DGRAM                    10527  2448/sudo           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9897   2059/java           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9898   2059/java           \n" +
            "unix  3      [ ]         DGRAM                    7897   1402/udevd          \n" +
            "unix  2      [ ]         DGRAM                    9770   2303/sendmail: Queu \n" +
            "unix  2      [ ]         DGRAM                    10132  2402/sshd           \n" +
            "unix  3      [ ]         STREAM     CONNECTED     10136  2404/sshd           \n" +
            "unix  2      [ ]         DGRAM                    9787   2311/crond          \n" +
            "unix  3      [ ]         STREAM     CONNECTED     9186   2127/dbus-daemon"),

    PS_AX_OUTPUT_WITH_NOT_ACTIVE_HAPROXY("  PID   TT  STAT      TIME COMMAND\n" +
            "    1   ??  Ss     5:44.13 /sbin/launchd\n" +
            "   44   ??  Ss     0:54.48 /usr/libexec/UserEventAgent (System)\n" +
            "   45   ??  Us     0:26.89 /usr/sbin/syslogd\n" +
            "   47   ??  Ss     5:10.43 /Library/Yota/Yota Access//YotaAccessService.app/Contents/MacOS/YotaAccessService\n" +
            "   48   ??  Ss     0:02.27 /usr/libexec/kextd\n" +
            "   49   ??  Ss     1:08.15 /System/Library/Frameworks/CoreServices.framework/Versions/A/Frameworks/FSEvents.framework/Versions/A/Support/fseventsd\n" +
            "   52   ??  Ss     0:08.67 /opt/cisco/anyconnect/bin/vpnagentd -execv_instance\n" +
            "   53   ??  Ss     0:01.25 /usr/libexec/thermald\n" +
            "   55   ??  Ss     0:00.68 /System/Library/CoreServices/appleeventsd --server\n" +
            "   56   ??  Ss     0:17.65 /usr/libexec/configd\n" +
            "   57   ??  Ss    11:43.90 /Library/Frameworks/eToken.framework/Versions/Current/eTSrv\n" +
            "   58   ??  Ss     0:07.64 /System/Library/CoreServices/powerd.bundle/powerd\n" +
            "   61   ??  Ss     0:12.37 /usr/libexec/airportd\n" +
            "   63   ??  SNs    0:00.61 /usr/libexec/warmd\n" +
            "   64   ??  Ss     5:42.50 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Support/mds\n" +
            "   68   ??  Ss     0:00.55 /System/Library/CoreServices/iconservicesd\n" +
            "   70   ??  Ss     0:00.44 /usr/libexec/diskarbitrationd\n" +
            "   73   ??  Ss     0:46.57 /usr/libexec/coreduetd\n" +
            "   76   ??  Ss     0:00.37 /System/Library/PrivateFrameworks/WirelessDiagnostics.framework/Support/awdd\n" +
            "   77   ??  Ss     0:55.73 /usr/libexec/opendirectoryd\n" +
            "   78   ??  Ss     0:05.70 /usr/sbin/wirelessproxd\n" +
            "   80   ??  Ss     1:08.73 /usr/libexec/discoveryd --udsocket standard --loglevel Basic --logclass Everything --logto asl\n" +
            "   81   ??  Ss     0:09.05 /System/Library/PrivateFrameworks/ApplePushService.framework/apsd\n" +
            "   82   ??  Us     0:37.42 /System/Library/CoreServices/launchservicesd\n" +
            "   83   ??  Ss     0:21.76 /System/Library/PrivateFrameworks/MobileDevice.framework/Versions/A/Resources/usbmuxd -launchd\n" +
            "   84   ??  Ss     0:12.93 /usr/sbin/securityd -i -s on\n" +
            "   86   ??  Ss     0:04.88 /usr/libexec/locationd\n" +
            "   89   ??  Ss     0:27.19 /usr/sbin/blued\n" +
            "   90   ??  Ss     0:00.05 autofsd\n" +
            "   96   ??  Ss     0:00.02 /usr/libexec/stackshot -t -O\n" +
            "   97   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/GenerationalStorage.framework/Versions/A/Support/revisiond\n" +
            "   98   ??  Ss     0:21.30 /System/Library/CoreServices/loginwindow.app/Contents/MacOS/loginwindow console\n" +
            "   99   ??  Ss     0:00.08 /System/Library/CoreServices/logind\n" +
            "  100   ??  Ss     0:00.02 /usr/sbin/KernelEventAgent\n" +
            "  102   ??  Ss     4:52.36 /usr/libexec/hidd\n" +
            "  103   ??  Ss     1:06.31 /usr/libexec/taskgated -s\n" +
            "  104   ??  Ss     1:10.55 /usr/sbin/notifyd\n" +
            "  106   ??  Ss     0:08.93 /usr/sbin/distnoted daemon\n" +
            "  108   ??  Ss     0:04.27 /usr/libexec/diagnosticd\n" +
            "  109   ??  Ss     1:44.65 /usr/sbin/cfprefsd daemon\n" +
            "  111   ??  Ss     0:02.24 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/authd.xpc/Contents/MacOS/authd\n" +
            "  122   ??  Ss     0:06.31 /System/Library/CoreServices/coreservicesd\n" +
            "  247   ??  Ss     0:00.09 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  249   ??  Ss     0:06.27 /System/Library/Frameworks/CryptoTokenKit.framework/ctkd -s\n" +
            "  251   ??  Us   114:47.08 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/CoreGraphics.framework/Resources/WindowServer -daemon\n" +
            "  276   ??  Ss     0:01.44 /usr/libexec/findmydeviced\n" +
            "  277   ??  Ss     0:00.74 /System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/CVMServer\n" +
            "  281   ??  Ss     0:00.17 /usr/libexec/nsurlstoraged\n" +
            "  282   ??  Ss     1:49.79 /usr/libexec/networkd\n" +
            "  283   ??  Ss     0:00.01 /usr/libexec/discoveryd_helper --loglevel Detailed --logclass Everything --logto asl\n" +
            "  284   ??  Ss     0:00.09 /usr/libexec/networkd_privileged\n" +
            "  288   ??  Ss     2:39.59 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  306   ??  Ss     0:00.56 /usr/libexec/nsurlsessiond --privileged\n" +
            "  307   ??  Ss     0:08.60 /usr/sbin/ntpd -c /private/etc/ntp-restrict.conf -n -g -p /var/run/ntpd.pid -f /var/db/ntp.drift\n" +
            "  309   ??  Ss     0:09.69 /usr/libexec/usbd\n" +
            "  311   ??  Ss     2:12.42 /System/Library/CryptoTokenKit/com.apple.ifdreader.slotd/Contents/MacOS/com.apple.ifdreader\n" +
            "  318   ??  Ss     3:52.81 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mds_stores\n" +
            "  319   ??  Ss     0:09.04 sysmond\n" +
            "  320   ??  Ss     0:00.13 /System/Library/PrivateFrameworks/AmbientDisplay.framework/Versions/A/XPCServices/com.apple.AmbientDisplayAgent.xpc/Contents/MacOS/com.apple.AmbientDisplayAgent\n" +
            "  329   ??  Ss     0:00.64 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/com.apple.CodeSigningHelper.xpc/Contents/MacOS/com.apple.CodeSigningHelper\n" +
            "  333   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/AccountPolicy.framework/XPCServices/com.apple.AccountPolicyHelper.xpc/Contents/MacOS/com.apple.AccountPolicyHelper\n" +
            "  334   ??  Ss     0:00.42 /usr/libexec/securityd_service\n" +
            "  335   ??  S      0:13.53 /usr/libexec/UserEventAgent (Aqua)\n" +
            "  337   ??  S      1:14.06 /usr/sbin/distnoted agent\n" +
            "  339   ??  S      0:34.31 /usr/sbin/cfprefsd agent\n" +
            "  342   ??  Ss     0:00.06 /usr/libexec/smd\n" +
            "  344   ??  S      0:08.60 /usr/sbin/usernoted\n" +
            "  345   ??  S      0:05.66 /usr/libexec/nsurlsessiond\n" +
            "  347   ??  S      0:08.70 /System/Library/PrivateFrameworks/CalendarAgent.framework/Executables/CalendarAgent\n" +
            "  349   ??  U      1:00.92 /usr/libexec/secinitd\n" +
            "  351   ??  S      0:02.42 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/Versions/A/Support/bird\n" +
            "  353   ??  S      0:00.13 /System/Library/PrivateFrameworks/AskPermission.framework/Versions/A/Resources/askpermissiond\n" +
            "  354   ??  S      0:01.22 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistorySyncHelper\n" +
            "  355   ??  S      0:00.48 /usr/libexec/fmfd\n" +
            "  358   ??  S      0:00.16 /usr/libexec/USBAgent\n" +
            "  359   ??  S      0:06.78 /System/Library/PrivateFrameworks/IDS.framework/identityservicesd.app/Contents/MacOS/identityservicesd\n" +
            "  360   ??  S      0:01.36 /usr/libexec/secd\n" +
            "  361   ??  S      0:01.44 /System/Library/PrivateFrameworks/TelephonyUtilities.framework/callservicesd\n" +
            "  362   ??  Ss     4:36.01 /usr/sbin/coreaudiod\n" +
            "  363   ??  Ss     0:02.47 /usr/libexec/watchdogd\n" +
            "  365   ??  S      0:04.15 /System/Library/CoreServices/AirPlayUIAgent.app/Contents/MacOS/AirPlayUIAgent --launchd\n" +
            "  367   ??  Ss     0:00.79 /usr/sbin/filecoordinationd\n" +
            "  368   ??  Ss     0:02.00 /usr/libexec/sandboxd -n PluginProcess -n \n" +
            "  369   ??  S      0:29.91 /System/Library/PrivateFrameworks/CloudKitDaemon.framework/Support/cloudd\n" +
            "  370   ??  Ss     0:01.62 /System/Library/PrivateFrameworks/CoreSymbolication.framework/coresymbolicationd\n" +
            "  371   ??  Ss     0:00.24 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd system\n" +
            "  372   ??  S      0:00.72 /System/Library/PrivateFrameworks/IMCore.framework/imagent.app/Contents/MacOS/imagent\n" +
            "  373   ??  S      0:00.18 /System/Library/PrivateFrameworks/IMDPersistence.framework/XPCServices/IMDPersistenceAgent.xpc/Contents/MacOS/IMDPersistenceAgent\n" +
            "  374   ??  U      0:02.82 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "  378   ??  Ss     0:39.94 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdated\n" +
            "  380   ??  Ss     0:00.22 /System/Library/PrivateFrameworks/SoftwareUpdate.framework/Resources/suhelperd\n" +
            "  382   ??  S      0:04.83 /usr/libexec/nsurlstoraged\n" +
            "  384   ??  S      0:00.11 /usr/sbin/pboard\n" +
            "  385   ??  Ss     0:01.24 /System/Library/PrivateFrameworks/CalendarAgent.framework/Versions/A/XPCServices/CalNCService.xpc/Contents/MacOS/CalNCService\n" +
            "  388   ??  S      0:08.30 /System/Library/Frameworks/Accounts.framework/Versions/A/Support/accountsd\n" +
            "  389   ??  S      0:17.76 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/ATS.framework/Support/fontd\n" +
            "  393   ??  S      0:00.66 /System/Library/CoreServices/pbs\n" +
            "  407   ??  S      0:00.18 /System/Library/Frameworks/Security.framework/Versions/A/Resources/CloudKeychainProxy.bundle/Contents/MacOS/CloudKeychainProxy\n" +
            "  415   ??  S      0:00.56 /System/Library/PrivateFrameworks/CloudPhotoServices.framework/Versions/A/Frameworks/CloudPhotoServicesConfiguration.framework/Versions/A/XPCServices/com.apple.CloudPhotosCon\n" +
            "  416   ??  Ss     0:33.95 /Library/CoreMediaIO/Plug-Ins/DAL/AppleCamera.plugin/Contents/Resources/AppleCameraAssistant\n" +
            "  417   ??  S      0:48.74 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Support/photolibraryd\n" +
            "  421   ??  Ss     0:00.57 /System/Library/PrivateFrameworks/PerformanceAnalysis.framework/XPCServices/com.apple.PerformanceAnalysis.animationperfd.xpc/Contents/MacOS/com.apple.PerformanceAnalysis.anim\n" +
            "  438   ??  Ss     0:01.77 /System/Library/PrivateFrameworks/CacheDelete.framework/deleted\n" +
            "  439   ??  Ss     0:00.48 /System/Library/CoreServices/backupd.bundle/Contents/Resources/TMCacheDelete\n" +
            "  497   ??  S      0:00.95 /usr/sbin/distnoted agent\n" +
            "  498   ??  S      0:09.17 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            "  576   ??  S      0:02.08 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            "  581   ??  Ss     0:18.99 /usr/libexec/systemstatsd\n" +
            "  605   ??  Ss     0:04.74 /usr/libexec/amfid\n" +
            "  698   ??  S      0:00.10 /System/Library/CoreServices/ScopedBookmarkAgent\n" +
            "  737   ??  Ss     0:00.64 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Frameworks/PhotoLibraryServices.framework/Versions/A/XPCServices/com.apple.photomoments.xpc/Content\n" +
            "  738   ??  S      0:01.44 /System/Library/CoreServices/cloudphotosd.app/Contents/MacOS/cloudphotosd\n" +
            "  752   ??  Ss     0:00.19 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/XPCServices/ContainerMetadataExtractor.xpc/Contents/MacOS/ContainerMetadataExtractor\n" +
            "  755   ??  S      0:01.77 /System/Library/PrivateFrameworks/GeoServices.framework/Versions/A/XPCServices/com.apple.geod.xpc/Contents/MacOS/com.apple.geod\n" +
            "  759   ??  S      1:08.58 /Applications/Microsoft Office 2011/Office/Microsoft Office Reminders.app/Contents/MacOS/Microsoft Office Reminders -psn_0_65552\n" +
            "  760   ??  S      1:34.16 /System/Library/CoreServices/Dock.app/Contents/MacOS/Dock\n" +
            "  762   ??  S      0:21.41 /System/Library/CoreServices/SystemUIServer.app/Contents/MacOS/SystemUIServer\n" +
            "  763   ??  S      2:03.38 /System/Library/CoreServices/Finder.app/Contents/MacOS/Finder\n" +
            "  766   ??  S      0:03.10 /System/Library/CoreServices/Spotlight.app/Contents/MacOS/Spotlight\n" +
            "  767   ??  S      0:01.77 /System/Library/CoreServices/iconservicesagent\n" +
            "  768   ??  S      0:14.09 /usr/libexec/sharingd\n" +
            "  769   ??  S      0:04.20 /usr/libexec/pkd\n" +
            "  770   ??  S      0:01.44 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeaccountd\n" +
            "  771   ??  Ss     0:00.85 /System/Library/CoreServices/Menu Extras/AirPort.menu/Contents/XPCServices/com.apple.wifi.proxy.xpc/Contents/MacOS/com.apple.wifi.proxy\n" +
            "  772   ??  S      0:01.69 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeassetd\n" +
            "  774   ??  S      0:01.43 /System/Library/PrivateFrameworks/ParsecUI.framework/Versions/A/Support/SpotlightNetHelper.app/Contents/MacOS/SpotlightNetHelper\n" +
            "  778   ??  S      0:07.64 /System/Library/CoreServices/lsuseractivityd\n" +
            "  780   ??  Ss     0:01.15 /System/Library/CoreServices/Dock.app/Contents/XPCServices/com.apple.dock.extra.xpc/Contents/MacOS/com.apple.dock.extra\n" +
            "  781   ??  S      0:00.54 /System/Library/PrivateFrameworks/MessagesKit.framework/Resources/soagent.app/Contents/MacOS/soagent\n" +
            "  782   ??  S      0:00.23 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistoryPluginHelper\n" +
            "  783   ??  S      0:01.68 /System/Library/CoreServices/AppleIDAuthAgent\n" +
            "  786   ??  S      3:34.43 /Applications/Microsoft Office 2011/Office/Microsoft Database Daemon.app/Contents/MacOS/Microsoft Database Daemon\n" +
            "  787   ??  S      0:00.76 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeuid.app/Contents/MacOS/storeuid\n" +
            "  788   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  790   ??  S      1:11.16 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  791   ??  S      0:00.42 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storedownloadd\n" +
            "  796   ??  S      0:00.06 /usr/libexec/spindump_agent\n" +
            "  798   ??  S      0:00.18 /System/Library/CoreServices/SocialPushAgent.app/Contents/MacOS/SocialPushAgent\n" +
            "  800   ??  S      0:00.40 /System/Library/CoreServices/Keychain Circle Notification.app/Contents/MacOS/Keychain Circle Notification\n" +
            "  803   ??  S      0:13.46 /System/Library/CoreServices/NotificationCenter.app/Contents/MacOS/NotificationCenter\n" +
            "  806   ??  S      0:00.43 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/MacOS/Watchdog\n" +
            "  809   ??  S      0:01.17 com.apple.photostream-agent\n" +
            "  810   ??  S      0:06.94 /System/Library/CoreServices/cloudpaird\n" +
            "  813   ??  S      1:10.25 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  814   ??  S      0:01.32 /System/Library/CoreServices/WiFiAgent.app/Contents/MacOS/WiFiAgent\n" +
            "  815   ??  S      0:01.93 /System/Library/CoreServices/diagnostics_agent\n" +
            "  823   ??  S      0:01.68 /System/Library/CoreServices/Menu Extras/TextInput.menu/Contents/SharedSupport/TISwitcher.app/Contents/MacOS/TISwitcher\n" +
            "  825   ??  S      0:00.18 /Applications/iTunes.app/Contents/MacOS/iTunesHelper.app/Contents/MacOS/iTunesHelper\n" +
            "  826   ??  Ss     0:00.07 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  827   ??  S     61:48.19 /Applications/Google Chrome.app/Contents/MacOS/Google Chrome\n" +
            "  834   ??  S      9:33.09 /Applications/Yota.app/Contents/MacOS/Yota /minimized\n" +
            "  838   ??  S      0:01.50 /Applications/Evernote.app/Contents/Library/LoginItems/EvernoteHelper.app/Contents/MacOS/EvernoteHelper\n" +
            "  839   ??  Ss     0:00.04 /System/Library/CoreServices/NotificationCenter.app/Contents/XPCServices/com.apple.notificationcenterui.WeatherSummary.xpc/Contents/MacOS/com.apple.notificationcenterui.Weath\n" +
            "  842   ??  S      0:00.45 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Framework.framework/Helpers/crashpad_handler --database=/Users/mikhailtyamin/Library/Application\n" +
            "  845   ??  S      0:00.05 /System/Library/PrivateFrameworks/StoreXPCServices.framework/Versions/A/XPCServices/com.apple.appstore.PluginXPCService.xpc/Contents/MacOS/com.apple.appstore.PluginXPCService\n" +
            "  847   ??  S      0:00.40 /System/Library/PrivateFrameworks/UniversalAccess.framework/Versions/A/Resources/universalAccessAuthWarn.app/Contents/MacOS/universalAccessAuthWarn launchd -s\n" +
            "  848   ??  S      0:09.06 /System/Library/Services/AppleSpell.service/Contents/MacOS/AppleSpell -psn_0_208947\n" +
            "  854   ??  S      0:00.07 /System/Library/PrivateFrameworks/DataDetectorsCore.framework/Versions/A/XPCServices/DataDetectorsDynamicData.xpc/Contents/MacOS/DataDetectorsDynamicData\n" +
            "  855   ??  S      0:00.22 /System/Library/Frameworks/InputMethodKit.framework/Versions/A/XPCServices/com.apple.InputMethodKit.UserDictionary.xpc/Contents/MacOS/com.apple.InputMethodKit.UserDictionary\n" +
            "  861   ??  Ss     0:00.13 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            "  862   ??  S      0:00.08 /System/Library/PrivateFrameworks/BookKit.framework/Versions/A/XPCServices/com.apple.BKAgentService.xpc/Contents/MacOS/com.apple.BKAgentService\n" +
            "  874   ??  S     26:30.33 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=gpu-process --channel=827.0.844825740 --su\n" +
            "  875   ??  Ss     0:08.77 /usr/sbin/spindump\n" +
            "  876   ??  Ss     0:00.07 /System/Library/CoreServices/CrashReporterSupportHelper server-init\n" +
            "  877   ??  Ss     0:08.10 /System/Library/CoreServices/SubmitDiagInfo server-init\n" +
            "  878   ??  Ss     0:04.51 /System/Library/Frameworks/VideoToolbox.framework/Versions/A/XPCServices/VTDecoderXPCService.xpc/Contents/MacOS/VTDecoderXPCService\n" +
            "  881   ??  S      0:00.30 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storelegacy\n" +
            "  891   ??  S      1:59.16 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  894   ??  S      0:22.16 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  902   ??  S      0:17.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  904   ??  S      0:05.46 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  905   ??  S      0:02.85 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  910   ??  S      0:03.70 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  911   ??  S      0:05.40 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  924   ??  S     29:28.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=ppapi --channel=827.17.1177654966 --ppapi-\n" +
            "  926   ??  S      0:01.32 /System/Library/PrivateFrameworks/InternetAccounts.framework/Versions/A/XPCServices/com.apple.internetaccounts.xpc/Contents/MacOS/com.apple.internetaccounts\n" +
            "  929   ??  S      0:00.45 /System/Library/PrivateFrameworks/CommerceKit.framework/Resources/LaterAgent.app/Contents/MacOS/LaterAgent\n" +
            "  932   ??  S      1:04.00 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  937   ??  S      1:02.77 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  974   ??  S      0:07.12 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  975   ??  S      6:10.30 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  978   ??  S      2:16.44 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  981   ??  S      2:04.13 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  992   ??  S      5:44.83 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  995   ??  S      0:56.73 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  997   ??  S     14:43.06 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            " 1017   ??  S      0:00.01 /System/Library/Frameworks/WebKit.framework/Frameworks/WebKitLegacy.framework/WebKitPluginAgent\n" +
            " 1045   ??  S      0:01.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            " 1082   ??  U     11:25.60 /Applications/Slack.app/Contents/MacOS/Slack\n" +
            " 1085   ??  S     10:32.32 /Applications/Microsoft Lync.app/Contents/MacOS/Microsoft Lync\n" +
            " 1088   ??  S      0:00.56 /Library/Application Support/Microsoft/MAU2.0/Microsoft AutoUpdate.app/Contents/MacOS/Microsoft AU Daemon.app/Contents/MacOS/Microsoft AU Daemon\n" +
            " 1089   ??  S      0:32.41 /Applications/Mailbox (Beta).app/Contents/MacOS/Mailbox (Beta)\n" +
            " 1093   ??  S     11:08.69 /Applications/Microsoft Office 2011/Microsoft Outlook.app/Contents/MacOS/Microsoft Outlook\n" +
            " 1094   ??  S      0:00.83 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/SpeechSynthesis.framework/Resources/com.apple.speech.speechsynthesisd\n" +
            " 1099   ??  Ss     0:00.05 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.SandboxHelper.xpc/Contents/MacOS/com.apple.audio.SandboxHelper\n" +
            " 1100   ??  Ss     0:00.08 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.ComponentHelper.xpc/Contents/MacOS/com.apple.audio.ComponentHelper\n" +
            " 1101   ??  Ss     0:00.31 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            " 1112   ??  S      0:05.57 /Applications/Microsoft Office 2011/Office/Microsoft Alerts Daemon.app/Contents/MacOS/Microsoft Alerts Daemon\n" +
            " 1123   ??  S      0:00.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            " 1200   ??  S      8:41.09 /Applications/Utilities/Terminal.app/Contents/MacOS/Terminal\n" +
            " 1287   ??  U    124:03.10 /Applications/IntelliJ IDEA 13.app/Contents/MacOS/idea\n" +
            " 1299   ??  S      0:10.95 /Applications/IntelliJ IDEA 13.app/Contents/bin/fsnotifier\n" +
            " 1631   ??  Ss     0:00.36 /System/Library/Frameworks/ApplicationServices.framework/Versions/A/Frameworks/HIServices.framework/Versions/A/XPCServices/com.apple.hiservices-xpcservice.xpc/Contents/MacOS/\n" +
            " 2238   ??  S      0:41.52 /Applications/Cisco/Cisco AnyConnect Secure Mobility Client.app/Contents/MacOS/Cisco AnyConnect Secure Mobility Client\n" +
            " 2250   ??  Z      0:00.00 (cscan)\n" +
            " 5502   ??  S      0:00.10 /System/Library/PrivateFrameworks/CommunicationsFilter.framework/CMFSyncAgent.app/Contents/MacOS/CMFSyncAgent\n" +
            " 5506   ??  Ss     0:00.04 /System/Library/Frameworks/CoreMediaIO.framework/Versions/A/XPCServices/com.apple.cmio.registerassistantservice.xpc/Contents/MacOS/com.apple.cmio.registerassistantservice\n" +
            " 5510   ??  S      0:00.08 /System/Library/PrivateFrameworks/ToneLibrary.framework/Versions/A/XPCServices/com.apple.tonelibraryd.xpc/Contents/MacOS/com.apple.tonelibraryd\n" +
            " 9438   ??  S     19:32.69 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "11518   ??  Ss     0:00.50 /System/Library/PrivateFrameworks/PackageKit.framework/Resources/installd\n" +
            "11519   ??  Ss     0:00.76 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdate_download_service\n" +
            "11520   ??  Ss     0:00.69 /System/Library/CoreServices/AssetCacheLocatorService\n" +
            "11521   ??  S      0:00.09 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "14544   ??  S      1:02.77 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "14752   ??  S      0:00.18 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/com.apple.sbd\n" +
            "14754   ??  S      0:00.39 /System/Library/PrivateFrameworks/CloudServices.framework/Versions/A/XPCServices/com.apple.lakitu.xpc/Contents/MacOS/com.apple.lakitu\n" +
            "14831   ??  S      0:21.23 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "18267   ??  S      0:00.33 /System/Library/CoreServices/mapspushd\n" +
            "18434   ??  S    111:03.89 /Applications/uTorrent.app/Contents/MacOS/uTorrent\n" +
            "21656   ??  S      0:00.15 /usr/libexec/loginitemregisterd\n" +
            "21839   ??  S      0:17.13 2BUA8C4S2C.com.agilebits.onepassword4-helper\n" +
            "21968   ??  S      0:00.16 /usr/bin/ssh-agent -l\n" +
            "22280   ??  S     13:36.43 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "23104   ??  S      0:00.33 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/EscrowSecurityAlert.app/Contents/MacOS/EscrowSecurityAlert\n" +
            "26022   ??  S      1:01.42 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "27574   ??  S     17:23.12 /Applications/Dropbox.app/Contents/MacOS/Dropbox /firstrunupdate 836\n" +
            "27603   ??  S      0:05.77 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27604   ??  S      0:23.06 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27608   ??  S      0:16.93 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27613   ??  Ss     0:02.16 /Applications/Dropbox.app/Contents/PlugIns/garcon.appex/Contents/MacOS/garcon\n" +
            "27624   ??  S      0:00.34 /System/Library/Image Capture/Support/Image Capture Extension.app/Contents/MacOS/Image Capture Extension\n" +
            "30057   ??  Ss     0:00.10 /usr/libexec/syspolicyd\n" +
            "35496   ??  SNs    0:00.03 /usr/libexec/periodic-wrapper daily\n" +
            "35498   ??  S      0:00.52 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbagent.app/Contents/MacOS/nbagent\n" +
            "35573   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbstated\n" +
            "48270   ??  S      0:07.28 /Applications/TextEdit.app/Contents/MacOS/TextEdit -psn_0_1511793\n" +
            "48273   ??  S      0:00.04 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/PrintCore.framework/Versions/A/printtool agent\n" +
            "48275   ??  Ss     0:01.35 /System/Library/Frameworks/AppKit.framework/Versions/C/XPCServices/com.apple.appkit.xpc.openAndSavePanelService.xpc/Contents/MacOS/com.apple.appkit.xpc.openAndSavePanelServic\n" +
            "48478   ??  S      0:00.03 /System/Library/PrivateFrameworks/HelpData.framework/Versions/A/Resources/helpd\n" +
            "48479   ??  S      6:46.17 /Applications/Skype.app/Contents/MacOS/Skype\n" +
            "48485   ??  S      0:02.12 /Library/Audio/Plug-Ins/HAL/EcammAudioLoader.plugin/Contents/Plugins/CallRecorder.plugin/Contents/Resources/CallRecorderAgent.app/Contents/MacOS/CallRecorderAgent C3456C2D-42\n" +
            "51626   ??  S      0:00.37 /System/Library/CoreServices/CoreServicesUIAgent.app/Contents/MacOS/CoreServicesUIAgent\n" +
            "53444   ??  S      0:05.94 /Applications/1Password 5.app/Contents/MacOS/1Password 5\n" +
            "62964   ??  SNs    0:00.01 /usr/libexec/periodic-wrapper weekly\n" +
            "63741   ??  S      0:07.97 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63760   ??  S      0:08.31 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63868   ??  S      0:08.27 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63869   ??  S      0:09.47 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "68362   ??  S      0:00.21 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "71707   ??  Ss     0:02.53 auditd -l\n" +
            "71763   ??  SNs    0:00.05 /usr/sbin/netbiosd\n" +
            "72904   ??  S      0:05.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "74745   ??  S      2:23.84 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82010   ??  S      0:06.58 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82815   ??  S      2:57.15 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "84834   ??  S      0:13.76 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/Resources/PKIMonitor.app/Contents/MacOS/PKIMonitor\n" +
            "84835   ??  Ss     0:11.47 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "84855   ??  S      0:04.68 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "88817   ??  S      0:15.16 /Applications/Microsoft Office 2011/Microsoft Word.app/Contents/MacOS/Microsoft Word -psn_0_2372163\n" +
            "90114   ??  S      0:15.35 /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -d64 -Djava.awt.headless=true -Didea.version==13.1.5 -Xmx512m -Dfile.encoding=UTF-8 -classpath /Appl\n" +
            "91431   ??  S      0:03.86 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "95155   ??  S      0:00.09 /System/Library/PrivateFrameworks/AOSKit.framework/Versions/A/XPCServices/com.apple.iCloudHelper.xpc/Contents/MacOS/com.apple.iCloudHelper\n" +
            "95156   ??  Ss     0:00.02 /usr/sbin/ocspd\n" +
            "95343   ??  Ss     0:00.02 haproxy -C /Users/mikhailtyamin/haproxy-config -f haproxy.cfg -D -p haproxy.pid\n" +
            "95345   ??  Ss     0:00.02 haproxy -C /Users/mikhailtyamin/haproxy-config -f haproxy.cfg -D -p haproxy.pid\n" +
            " 1202 s000  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1222 s000  S+     0:00.28 -bash\n" +
            " 1203 s001  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1208 s001  S+     0:00.02 -bash\n" +
            " 1204 s002  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1225 s002  S+     0:00.01 -bash\n" +
            " 1205 s003  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1228 s003  S+     0:00.01 -bash\n" +
            " 1206 s004  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1215 s004  S+     0:00.01 -bash\n" +
            " 1207 s005  Ss     0:00.02 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1210 s005  S      0:00.04 -bash\n" +
            "95375 s005  R+     0:00.00 ps ax\n" +
            "51432 s006  Us     0:00.13 login -pf mikhailtyamin\n" +
            "51433 s006  S+     0:00.17 -bash\n" +
            "56701 s007  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "56702 s007  S+     0:00.08 -bash\n" +
            "21932 s008  Ss     0:00.07 login -pf mikhailtyamin\n" +
            "21933 s008  S+     0:00.02 -bash\n" +
            "29904 s009  Ss     0:00.07 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "29905 s009  S+     0:00.05 -bash\n" +
            "74277 s010  Ss     0:00.09 login -pf mikhailtyamin\n" +
            "74278 s010  S+     0:00.25 -bash\n" +
            "90693 s011  Ss     0:00.16 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "90694 s011  S+     0:00.02 -bash"),

    PS_AX_OUTPUT_WITHOUT_HAPROXY("  PID   TT  STAT      TIME COMMAND\n" +
            "    1   ??  Us     5:40.38 /sbin/launchd\n" +
            "   44   ??  Ss     0:53.87 /usr/libexec/UserEventAgent (System)\n" +
            "   45   ??  Ss     0:26.60 /usr/sbin/syslogd\n" +
            "   47   ??  Ss     5:09.23 /Library/Yota/Yota Access//YotaAccessService.app/Contents/MacOS/YotaAccessService\n" +
            "   48   ??  Ss     0:02.27 /usr/libexec/kextd\n" +
            "   49   ??  Ss     1:07.62 /System/Library/Frameworks/CoreServices.framework/Versions/A/Frameworks/FSEvents.framework/Versions/A/Support/fseventsd\n" +
            "   52   ??  Ss     0:08.63 /opt/cisco/anyconnect/bin/vpnagentd -execv_instance\n" +
            "   53   ??  Ss     0:01.24 /usr/libexec/thermald\n" +
            "   55   ??  Ss     0:00.68 /System/Library/CoreServices/appleeventsd --server\n" +
            "   56   ??  Ss     0:17.52 /usr/libexec/configd\n" +
            "   57   ??  Ss    11:36.27 /Library/Frameworks/eToken.framework/Versions/Current/eTSrv\n" +
            "   58   ??  Ss     0:07.58 /System/Library/CoreServices/powerd.bundle/powerd\n" +
            "   61   ??  Ss     0:12.36 /usr/libexec/airportd\n" +
            "   63   ??  SNs    0:00.61 /usr/libexec/warmd\n" +
            "   64   ??  Ss     5:41.81 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Support/mds\n" +
            "   68   ??  Ss     0:00.55 /System/Library/CoreServices/iconservicesd\n" +
            "   70   ??  Ss     0:00.44 /usr/libexec/diskarbitrationd\n" +
            "   73   ??  Ss     0:46.39 /usr/libexec/coreduetd\n" +
            "   76   ??  Ss     0:00.36 /System/Library/PrivateFrameworks/WirelessDiagnostics.framework/Support/awdd\n" +
            "   77   ??  Ss     0:55.11 /usr/libexec/opendirectoryd\n" +
            "   78   ??  Ss     0:05.70 /usr/sbin/wirelessproxd\n" +
            "   80   ??  Ss     1:08.07 /usr/libexec/discoveryd --udsocket standard --loglevel Basic --logclass Everything --logto asl\n" +
            "   81   ??  Ss     0:09.01 /System/Library/PrivateFrameworks/ApplePushService.framework/apsd\n" +
            "   82   ??  Ss     0:37.35 /System/Library/CoreServices/launchservicesd\n" +
            "   83   ??  Ss     0:21.53 /System/Library/PrivateFrameworks/MobileDevice.framework/Versions/A/Resources/usbmuxd -launchd\n" +
            "   84   ??  Ss     0:12.88 /usr/sbin/securityd -i -s on\n" +
            "   86   ??  Ss     0:04.85 /usr/libexec/locationd\n" +
            "   89   ??  Ss     0:27.19 /usr/sbin/blued\n" +
            "   90   ??  Ss     0:00.05 autofsd\n" +
            "   96   ??  Ss     0:00.02 /usr/libexec/stackshot -t -O\n" +
            "   97   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/GenerationalStorage.framework/Versions/A/Support/revisiond\n" +
            "   98   ??  Ss     0:21.22 /System/Library/CoreServices/loginwindow.app/Contents/MacOS/loginwindow console\n" +
            "   99   ??  Ss     0:00.08 /System/Library/CoreServices/logind\n" +
            "  100   ??  Ss     0:00.02 /usr/sbin/KernelEventAgent\n" +
            "  102   ??  Ss     4:48.56 /usr/libexec/hidd\n" +
            "  103   ??  Ss     1:05.57 /usr/libexec/taskgated -s\n" +
            "  104   ??  Ss     1:09.72 /usr/sbin/notifyd\n" +
            "  106   ??  Ss     0:08.86 /usr/sbin/distnoted daemon\n" +
            "  108   ??  Ss     0:04.22 /usr/libexec/diagnosticd\n" +
            "  109   ??  Ss     1:43.51 /usr/sbin/cfprefsd daemon\n" +
            "  111   ??  Ss     0:02.22 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/authd.xpc/Contents/MacOS/authd\n" +
            "  122   ??  Ss     0:06.31 /System/Library/CoreServices/coreservicesd\n" +
            "  247   ??  Ss     0:00.09 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  249   ??  Ss     0:06.20 /System/Library/Frameworks/CryptoTokenKit.framework/ctkd -s\n" +
            "  251   ??  Ss   113:15.44 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/CoreGraphics.framework/Resources/WindowServer -daemon\n" +
            "  276   ??  Ss     0:01.43 /usr/libexec/findmydeviced\n" +
            "  277   ??  Ss     0:00.74 /System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/CVMServer\n" +
            "  281   ??  Ss     0:00.17 /usr/libexec/nsurlstoraged\n" +
            "  282   ??  Ss     1:49.30 /usr/libexec/networkd\n" +
            "  283   ??  Ss     0:00.01 /usr/libexec/discoveryd_helper --loglevel Detailed --logclass Everything --logto asl\n" +
            "  284   ??  Ss     0:00.09 /usr/libexec/networkd_privileged\n" +
            "  288   ??  Ss     2:38.30 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "  306   ??  Ss     0:00.55 /usr/libexec/nsurlsessiond --privileged\n" +
            "  307   ??  Ss     0:08.53 /usr/sbin/ntpd -c /private/etc/ntp-restrict.conf -n -g -p /var/run/ntpd.pid -f /var/db/ntp.drift\n" +
            "  309   ??  Ss     0:09.69 /usr/libexec/usbd\n" +
            "  311   ??  Ss     2:12.42 /System/Library/CryptoTokenKit/com.apple.ifdreader.slotd/Contents/MacOS/com.apple.ifdreader\n" +
            "  318   ??  Us     3:52.22 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mds_stores\n" +
            "  319   ??  Ss     0:08.96 sysmond\n" +
            "  320   ??  Ss     0:00.13 /System/Library/PrivateFrameworks/AmbientDisplay.framework/Versions/A/XPCServices/com.apple.AmbientDisplayAgent.xpc/Contents/MacOS/com.apple.AmbientDisplayAgent\n" +
            "  329   ??  Ss     0:00.64 /System/Library/Frameworks/Security.framework/Versions/A/XPCServices/com.apple.CodeSigningHelper.xpc/Contents/MacOS/com.apple.CodeSigningHelper\n" +
            "  333   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/AccountPolicy.framework/XPCServices/com.apple.AccountPolicyHelper.xpc/Contents/MacOS/com.apple.AccountPolicyHelper\n" +
            "  334   ??  Ss     0:00.42 /usr/libexec/securityd_service\n" +
            "  335   ??  S      0:13.50 /usr/libexec/UserEventAgent (Aqua)\n" +
            "  337   ??  S      1:13.69 /usr/sbin/distnoted agent\n" +
            "  339   ??  S      0:34.00 /usr/sbin/cfprefsd agent\n" +
            "  342   ??  Ss     0:00.06 /usr/libexec/smd\n" +
            "  344   ??  S      0:08.60 /usr/sbin/usernoted\n" +
            "  345   ??  S      0:05.66 /usr/libexec/nsurlsessiond\n" +
            "  347   ??  S      0:08.69 /System/Library/PrivateFrameworks/CalendarAgent.framework/Executables/CalendarAgent\n" +
            "  349   ??  S      1:00.91 /usr/libexec/secinitd\n" +
            "  351   ??  S      0:02.42 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/Versions/A/Support/bird\n" +
            "  353   ??  S      0:00.13 /System/Library/PrivateFrameworks/AskPermission.framework/Versions/A/Resources/askpermissiond\n" +
            "  354   ??  S      0:01.22 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistorySyncHelper\n" +
            "  355   ??  S      0:00.48 /usr/libexec/fmfd\n" +
            "  358   ??  S      0:00.16 /usr/libexec/USBAgent\n" +
            "  359   ??  S      0:06.76 /System/Library/PrivateFrameworks/IDS.framework/identityservicesd.app/Contents/MacOS/identityservicesd\n" +
            "  360   ??  S      0:01.35 /usr/libexec/secd\n" +
            "  361   ??  S      0:01.44 /System/Library/PrivateFrameworks/TelephonyUtilities.framework/callservicesd\n" +
            "  362   ??  Ss     4:35.97 /usr/sbin/coreaudiod\n" +
            "  363   ??  Ss     0:02.44 /usr/libexec/watchdogd\n" +
            "  365   ??  S      0:04.15 /System/Library/CoreServices/AirPlayUIAgent.app/Contents/MacOS/AirPlayUIAgent --launchd\n" +
            "  367   ??  Ss     0:00.79 /usr/sbin/filecoordinationd\n" +
            "  368   ??  Ss     0:02.00 /usr/libexec/sandboxd -n PluginProcess -n \n" +
            "  369   ??  S      0:29.77 /System/Library/PrivateFrameworks/CloudKitDaemon.framework/Support/cloudd\n" +
            "  370   ??  Ss     0:01.62 /System/Library/PrivateFrameworks/CoreSymbolication.framework/coresymbolicationd\n" +
            "  371   ??  Ss     0:00.24 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd system\n" +
            "  372   ??  S      0:00.72 /System/Library/PrivateFrameworks/IMCore.framework/imagent.app/Contents/MacOS/imagent\n" +
            "  373   ??  S      0:00.18 /System/Library/PrivateFrameworks/IMDPersistence.framework/XPCServices/IMDPersistenceAgent.xpc/Contents/MacOS/IMDPersistenceAgent\n" +
            "  374   ??  S      0:02.82 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "  378   ??  Ss     0:39.94 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdated\n" +
            "  380   ??  Ss     0:00.22 /System/Library/PrivateFrameworks/SoftwareUpdate.framework/Resources/suhelperd\n" +
            "  382   ??  S      0:04.80 /usr/libexec/nsurlstoraged\n" +
            "  384   ??  S      0:00.11 /usr/sbin/pboard\n" +
            "  385   ??  Ss     0:01.24 /System/Library/PrivateFrameworks/CalendarAgent.framework/Versions/A/XPCServices/CalNCService.xpc/Contents/MacOS/CalNCService\n" +
            "  388   ??  S      0:08.30 /System/Library/Frameworks/Accounts.framework/Versions/A/Support/accountsd\n" +
            "  389   ??  S      0:17.75 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/ATS.framework/Support/fontd\n" +
            "  393   ??  S      0:00.66 /System/Library/CoreServices/pbs\n" +
            "  407   ??  S      0:00.18 /System/Library/Frameworks/Security.framework/Versions/A/Resources/CloudKeychainProxy.bundle/Contents/MacOS/CloudKeychainProxy\n" +
            "  415   ??  S      0:00.56 /System/Library/PrivateFrameworks/CloudPhotoServices.framework/Versions/A/Frameworks/CloudPhotoServicesConfiguration.framework/Versions/A/XPCServices/com.apple.CloudPhotosCon\n" +
            "  416   ??  Ss     0:33.95 /Library/CoreMediaIO/Plug-Ins/DAL/AppleCamera.plugin/Contents/Resources/AppleCameraAssistant\n" +
            "  417   ??  S      0:48.74 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Support/photolibraryd\n" +
            "  421   ??  Ss     0:00.57 /System/Library/PrivateFrameworks/PerformanceAnalysis.framework/XPCServices/com.apple.PerformanceAnalysis.animationperfd.xpc/Contents/MacOS/com.apple.PerformanceAnalysis.anim\n" +
            "  438   ??  Ss     0:01.77 /System/Library/PrivateFrameworks/CacheDelete.framework/deleted\n" +
            "  439   ??  Ss     0:00.48 /System/Library/CoreServices/backupd.bundle/Contents/Resources/TMCacheDelete\n" +
            "  497   ??  S      0:00.95 /usr/sbin/distnoted agent\n" +
            "  498   ??  S      0:09.17 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            "  576   ??  S      0:02.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            "  581   ??  Ss     0:18.93 /usr/libexec/systemstatsd\n" +
            "  605   ??  Ss     0:04.74 /usr/libexec/amfid\n" +
            "  698   ??  S      0:00.10 /System/Library/CoreServices/ScopedBookmarkAgent\n" +
            "  737   ??  Ss     0:00.64 /System/Library/PrivateFrameworks/PhotoLibraryPrivate.framework/Versions/A/Frameworks/PhotoLibraryServices.framework/Versions/A/XPCServices/com.apple.photomoments.xpc/Content\n" +
            "  738   ??  S      0:01.43 /System/Library/CoreServices/cloudphotosd.app/Contents/MacOS/cloudphotosd\n" +
            "  752   ??  Ss     0:00.19 /System/Library/PrivateFrameworks/CloudDocsDaemon.framework/XPCServices/ContainerMetadataExtractor.xpc/Contents/MacOS/ContainerMetadataExtractor\n" +
            "  755   ??  S      0:01.77 /System/Library/PrivateFrameworks/GeoServices.framework/Versions/A/XPCServices/com.apple.geod.xpc/Contents/MacOS/com.apple.geod\n" +
            "  759   ??  S      1:07.80 /Applications/Microsoft Office 2011/Office/Microsoft Office Reminders.app/Contents/MacOS/Microsoft Office Reminders -psn_0_65552\n" +
            "  760   ??  S      1:34.08 /System/Library/CoreServices/Dock.app/Contents/MacOS/Dock\n" +
            "  762   ??  S      0:21.35 /System/Library/CoreServices/SystemUIServer.app/Contents/MacOS/SystemUIServer\n" +
            "  763   ??  S      2:02.63 /System/Library/CoreServices/Finder.app/Contents/MacOS/Finder\n" +
            "  766   ??  S      0:03.10 /System/Library/CoreServices/Spotlight.app/Contents/MacOS/Spotlight\n" +
            "  767   ??  S      0:01.77 /System/Library/CoreServices/iconservicesagent\n" +
            "  768   ??  S      0:14.09 /usr/libexec/sharingd\n" +
            "  769   ??  S      0:04.19 /usr/libexec/pkd\n" +
            "  770   ??  S      0:01.44 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeaccountd\n" +
            "  771   ??  Ss     0:00.85 /System/Library/CoreServices/Menu Extras/AirPort.menu/Contents/XPCServices/com.apple.wifi.proxy.xpc/Contents/MacOS/com.apple.wifi.proxy\n" +
            "  772   ??  S      0:01.69 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeassetd\n" +
            "  774   ??  S      0:01.42 /System/Library/PrivateFrameworks/ParsecUI.framework/Versions/A/Support/SpotlightNetHelper.app/Contents/MacOS/SpotlightNetHelper\n" +
            "  778   ??  S      0:07.64 /System/Library/CoreServices/lsuseractivityd\n" +
            "  780   ??  Ss     0:01.14 /System/Library/CoreServices/Dock.app/Contents/XPCServices/com.apple.dock.extra.xpc/Contents/MacOS/com.apple.dock.extra\n" +
            "  781   ??  S      0:00.54 /System/Library/PrivateFrameworks/MessagesKit.framework/Resources/soagent.app/Contents/MacOS/soagent\n" +
            "  782   ??  S      0:00.23 /System/Library/PrivateFrameworks/CallHistory.framework/Support/CallHistoryPluginHelper\n" +
            "  783   ??  S      0:01.68 /System/Library/CoreServices/AppleIDAuthAgent\n" +
            "  786   ??  S      3:32.61 /Applications/Microsoft Office 2011/Office/Microsoft Database Daemon.app/Contents/MacOS/Microsoft Database Daemon\n" +
            "  787   ??  S      0:00.76 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storeuid.app/Contents/MacOS/storeuid\n" +
            "  788   ??  Ss     0:00.28 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  790   ??  S      1:10.46 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  791   ??  S      0:00.42 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storedownloadd\n" +
            "  796   ??  S      0:00.06 /usr/libexec/spindump_agent\n" +
            "  798   ??  S      0:00.18 /System/Library/CoreServices/SocialPushAgent.app/Contents/MacOS/SocialPushAgent\n" +
            "  800   ??  S      0:00.40 /System/Library/CoreServices/Keychain Circle Notification.app/Contents/MacOS/Keychain Circle Notification\n" +
            "  803   ??  S      0:13.45 /System/Library/CoreServices/NotificationCenter.app/Contents/MacOS/NotificationCenter\n" +
            "  806   ??  S      0:00.43 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/MacOS/Watchdog\n" +
            "  809   ??  S      0:01.17 com.apple.photostream-agent\n" +
            "  810   ??  S      0:06.94 /System/Library/CoreServices/cloudpaird\n" +
            "  813   ??  S      1:09.55 /Applications/Microsoft Office 2011/Office/SyncServicesAgent.app/Contents/MacOS/SyncServicesAgent\n" +
            "  814   ??  S      0:01.32 /System/Library/CoreServices/WiFiAgent.app/Contents/MacOS/WiFiAgent\n" +
            "  815   ??  S      0:01.93 /System/Library/CoreServices/diagnostics_agent\n" +
            "  823   ??  S      0:01.68 /System/Library/CoreServices/Menu Extras/TextInput.menu/Contents/SharedSupport/TISwitcher.app/Contents/MacOS/TISwitcher\n" +
            "  825   ??  S      0:00.18 /Applications/iTunes.app/Contents/MacOS/iTunesHelper.app/Contents/MacOS/iTunesHelper\n" +
            "  826   ??  Ss     0:00.07 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/XPCServices/com.apple.CommerceKit.TransactionService.xpc/Contents/MacOS/com.apple.CommerceKit.TransactionSe\n" +
            "  827   ??  S     61:42.58 /Applications/Google Chrome.app/Contents/MacOS/Google Chrome\n" +
            "  834   ??  S      9:30.66 /Applications/Yota.app/Contents/MacOS/Yota /minimized\n" +
            "  838   ??  S      0:01.50 /Applications/Evernote.app/Contents/Library/LoginItems/EvernoteHelper.app/Contents/MacOS/EvernoteHelper\n" +
            "  839   ??  Ss     0:00.04 /System/Library/CoreServices/NotificationCenter.app/Contents/XPCServices/com.apple.notificationcenterui.WeatherSummary.xpc/Contents/MacOS/com.apple.notificationcenterui.Weath\n" +
            "  842   ??  S      0:00.45 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Framework.framework/Helpers/crashpad_handler --database=/Users/mikhailtyamin/Library/Application\n" +
            "  845   ??  S      0:00.05 /System/Library/PrivateFrameworks/StoreXPCServices.framework/Versions/A/XPCServices/com.apple.appstore.PluginXPCService.xpc/Contents/MacOS/com.apple.appstore.PluginXPCService\n" +
            "  847   ??  S      0:00.40 /System/Library/PrivateFrameworks/UniversalAccess.framework/Versions/A/Resources/universalAccessAuthWarn.app/Contents/MacOS/universalAccessAuthWarn launchd -s\n" +
            "  848   ??  S      0:09.06 /System/Library/Services/AppleSpell.service/Contents/MacOS/AppleSpell -psn_0_208947\n" +
            "  854   ??  S      0:00.07 /System/Library/PrivateFrameworks/DataDetectorsCore.framework/Versions/A/XPCServices/DataDetectorsDynamicData.xpc/Contents/MacOS/DataDetectorsDynamicData\n" +
            "  855   ??  S      0:00.22 /System/Library/Frameworks/InputMethodKit.framework/Versions/A/XPCServices/com.apple.InputMethodKit.UserDictionary.xpc/Contents/MacOS/com.apple.InputMethodKit.UserDictionary\n" +
            "  861   ??  Ss     0:00.13 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            "  862   ??  S      0:00.08 /System/Library/PrivateFrameworks/BookKit.framework/Versions/A/XPCServices/com.apple.BKAgentService.xpc/Contents/MacOS/com.apple.BKAgentService\n" +
            "  874   ??  S     26:29.86 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=gpu-process --channel=827.0.844825740 --su\n" +
            "  875   ??  Ss     0:08.77 /usr/sbin/spindump\n" +
            "  876   ??  Ss     0:00.07 /System/Library/CoreServices/CrashReporterSupportHelper server-init\n" +
            "  877   ??  Ss     0:08.10 /System/Library/CoreServices/SubmitDiagInfo server-init\n" +
            "  878   ??  Ss     0:04.51 /System/Library/Frameworks/VideoToolbox.framework/Versions/A/XPCServices/VTDecoderXPCService.xpc/Contents/MacOS/VTDecoderXPCService\n" +
            "  881   ??  S      0:00.30 /System/Library/PrivateFrameworks/CommerceKit.framework/Versions/A/Resources/storelegacy\n" +
            "  891   ??  S      1:58.46 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  894   ??  S      0:22.09 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  902   ??  S      0:17.44 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  904   ??  S      0:05.44 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  905   ??  S      0:02.84 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  910   ??  S      0:03.69 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  911   ??  S      0:05.39 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  924   ??  S     29:11.10 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=ppapi --channel=827.17.1177654966 --ppapi-\n" +
            "  926   ??  S      0:01.32 /System/Library/PrivateFrameworks/InternetAccounts.framework/Versions/A/XPCServices/com.apple.internetaccounts.xpc/Contents/MacOS/com.apple.internetaccounts\n" +
            "  929   ??  S      0:00.45 /System/Library/PrivateFrameworks/CommerceKit.framework/Resources/LaterAgent.app/Contents/MacOS/LaterAgent\n" +
            "  932   ??  S      1:03.99 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  937   ??  S      1:02.21 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  974   ??  S      0:07.09 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  975   ??  S      6:08.47 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  978   ??  S      2:15.49 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  981   ??  S      2:02.85 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  992   ??  S      5:43.43 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  995   ??  S      0:56.19 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "  997   ??  S     14:28.14 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            " 1017   ??  S      0:00.01 /System/Library/Frameworks/WebKit.framework/Frameworks/WebKitLegacy.framework/WebKitPluginAgent\n" +
            " 1045   ??  S      0:01.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker-sizing -c MDSSizingWorker -m com.apple.mdworker.sizing\n" +
            " 1082   ??  U     11:19.72 /Applications/Slack.app/Contents/MacOS/Slack\n" +
            " 1085   ??  S     10:22.99 /Applications/Microsoft Lync.app/Contents/MacOS/Microsoft Lync\n" +
            " 1088   ??  S      0:00.56 /Library/Application Support/Microsoft/MAU2.0/Microsoft AutoUpdate.app/Contents/MacOS/Microsoft AU Daemon.app/Contents/MacOS/Microsoft AU Daemon\n" +
            " 1089   ??  S      0:32.27 /Applications/Mailbox (Beta).app/Contents/MacOS/Mailbox (Beta)\n" +
            " 1093   ??  S     11:06.33 /Applications/Microsoft Office 2011/Microsoft Outlook.app/Contents/MacOS/Microsoft Outlook\n" +
            " 1094   ??  S      0:00.83 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/SpeechSynthesis.framework/Resources/com.apple.speech.speechsynthesisd\n" +
            " 1099   ??  Ss     0:00.05 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.SandboxHelper.xpc/Contents/MacOS/com.apple.audio.SandboxHelper\n" +
            " 1100   ??  Ss     0:00.08 /System/Library/Frameworks/AudioToolbox.framework/XPCServices/com.apple.audio.ComponentHelper.xpc/Contents/MacOS/com.apple.audio.ComponentHelper\n" +
            " 1101   ??  Ss     0:00.31 /System/Library/Frameworks/QTKit.framework/Versions/A/XPCServices/com.apple.qtkitserver.xpc/Contents/MacOS/com.apple.qtkitserver\n" +
            " 1112   ??  S      0:05.52 /Applications/Microsoft Office 2011/Office/Microsoft Alerts Daemon.app/Contents/MacOS/Microsoft Alerts Daemon\n" +
            " 1123   ??  S      0:00.07 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdflagwriter\n" +
            " 1200   ??  S      8:35.90 /Applications/Utilities/Terminal.app/Contents/MacOS/Terminal\n" +
            " 1287   ??  S    119:15.09 /Applications/IntelliJ IDEA 13.app/Contents/MacOS/idea\n" +
            " 1299   ??  S      0:10.86 /Applications/IntelliJ IDEA 13.app/Contents/bin/fsnotifier\n" +
            " 1631   ??  Ss     0:00.36 /System/Library/Frameworks/ApplicationServices.framework/Versions/A/Frameworks/HIServices.framework/Versions/A/XPCServices/com.apple.hiservices-xpcservice.xpc/Contents/MacOS/\n" +
            " 2238   ??  S      0:41.50 /Applications/Cisco/Cisco AnyConnect Secure Mobility Client.app/Contents/MacOS/Cisco AnyConnect Secure Mobility Client\n" +
            " 2250   ??  Z      0:00.00 (cscan)\n" +
            " 5502   ??  S      0:00.10 /System/Library/PrivateFrameworks/CommunicationsFilter.framework/CMFSyncAgent.app/Contents/MacOS/CMFSyncAgent\n" +
            " 5506   ??  Ss     0:00.04 /System/Library/Frameworks/CoreMediaIO.framework/Versions/A/XPCServices/com.apple.cmio.registerassistantservice.xpc/Contents/MacOS/com.apple.cmio.registerassistantservice\n" +
            " 5510   ??  S      0:00.08 /System/Library/PrivateFrameworks/ToneLibrary.framework/Versions/A/XPCServices/com.apple.tonelibraryd.xpc/Contents/MacOS/com.apple.tonelibraryd\n" +
            " 9438   ??  S     19:13.90 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "11518   ??  Ss     0:00.50 /System/Library/PrivateFrameworks/PackageKit.framework/Resources/installd\n" +
            "11519   ??  Ss     0:00.76 /System/Library/CoreServices/Software Update.app/Contents/Resources/softwareupdate_download_service\n" +
            "11520   ??  Ss     0:00.69 /System/Library/CoreServices/AssetCacheLocatorService\n" +
            "11521   ??  S      0:00.09 /System/Library/PrivateFrameworks/TCC.framework/Resources/tccd\n" +
            "14544   ??  S      1:02.55 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "14752   ??  S      0:00.18 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/com.apple.sbd\n" +
            "14754   ??  S      0:00.39 /System/Library/PrivateFrameworks/CloudServices.framework/Versions/A/XPCServices/com.apple.lakitu.xpc/Contents/MacOS/com.apple.lakitu\n" +
            "14831   ??  S      0:21.20 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "18267   ??  S      0:00.33 /System/Library/CoreServices/mapspushd\n" +
            "18434   ??  S    109:14.01 /Applications/uTorrent.app/Contents/MacOS/uTorrent\n" +
            "21656   ??  S      0:00.15 /usr/libexec/loginitemregisterd\n" +
            "21839   ??  S      0:17.01 2BUA8C4S2C.com.agilebits.onepassword4-helper\n" +
            "21968   ??  S      0:00.16 /usr/bin/ssh-agent -l\n" +
            "22280   ??  S     13:20.60 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "23104   ??  S      0:00.33 /System/Library/PrivateFrameworks/CloudServices.framework/Resources/EscrowSecurityAlert.app/Contents/MacOS/EscrowSecurityAlert\n" +
            "26022   ??  S      1:00.89 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "27574   ??  S     17:02.65 /Applications/Dropbox.app/Contents/MacOS/Dropbox /firstrunupdate 836\n" +
            "27603   ??  S      0:05.70 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27604   ??  S      0:22.79 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27608   ??  S      0:16.74 /Library/DropboxHelperTools/Dropbox_u501/dbfseventsd\n" +
            "27613   ??  Ss     0:02.11 /Applications/Dropbox.app/Contents/PlugIns/garcon.appex/Contents/MacOS/garcon\n" +
            "27624   ??  S      0:00.34 /System/Library/Image Capture/Support/Image Capture Extension.app/Contents/MacOS/Image Capture Extension\n" +
            "30057   ??  Ss     0:00.10 /usr/libexec/syspolicyd\n" +
            "35496   ??  SNs    0:00.03 /usr/libexec/periodic-wrapper daily\n" +
            "35498   ??  S      0:00.52 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbagent.app/Contents/MacOS/nbagent\n" +
            "35573   ??  Ss     0:00.11 /System/Library/PrivateFrameworks/Noticeboard.framework/Versions/A/Resources/nbstated\n" +
            "48270   ??  S      0:07.28 /Applications/TextEdit.app/Contents/MacOS/TextEdit -psn_0_1511793\n" +
            "48273   ??  S      0:00.04 /System/Library/Frameworks/ApplicationServices.framework/Frameworks/PrintCore.framework/Versions/A/printtool agent\n" +
            "48275   ??  Ss     0:01.35 /System/Library/Frameworks/AppKit.framework/Versions/C/XPCServices/com.apple.appkit.xpc.openAndSavePanelService.xpc/Contents/MacOS/com.apple.appkit.xpc.openAndSavePanelServic\n" +
            "48478   ??  S      0:00.03 /System/Library/PrivateFrameworks/HelpData.framework/Versions/A/Resources/helpd\n" +
            "48479   ??  S      6:42.13 /Applications/Skype.app/Contents/MacOS/Skype\n" +
            "48485   ??  S      0:02.09 /Library/Audio/Plug-Ins/HAL/EcammAudioLoader.plugin/Contents/Plugins/CallRecorder.plugin/Contents/Resources/CallRecorderAgent.app/Contents/MacOS/CallRecorderAgent C3456C2D-42\n" +
            "51626   ??  S      0:00.37 /System/Library/CoreServices/CoreServicesUIAgent.app/Contents/MacOS/CoreServicesUIAgent\n" +
            "53444   ??  S      0:05.93 /Applications/1Password 5.app/Contents/MacOS/1Password 5\n" +
            "62964   ??  SNs    0:00.01 /usr/libexec/periodic-wrapper weekly\n" +
            "63741   ??  S      0:07.84 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63760   ??  S      0:07.97 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63868   ??  S      0:08.20 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "63869   ??  S      0:09.39 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "68362   ??  S      0:00.21 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.shared\n" +
            "71707   ??  Ss     0:02.43 auditd -l\n" +
            "71763   ??  SNs    0:00.05 /usr/sbin/netbiosd\n" +
            "72904   ??  S      0:05.44 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "74745   ??  S      2:22.41 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82010   ??  S      0:06.55 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "82815   ??  S      2:48.89 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "84834   ??  S      0:12.19 /Applications/SafeNet/SafeNet Authentication Client/Start SafeNet Authentication Client.app/Contents/Resources/PKIMonitor.app/Contents/MacOS/PKIMonitor\n" +
            "84835   ??  Ss     0:10.17 /System/Library/Frameworks/PCSC.framework/Versions/A/XPCServices/com.apple.ctkpcscd.xpc/Contents/MacOS/com.apple.ctkpcscd\n" +
            "84855   ??  S      0:04.31 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "88817   ??  S      0:15.00 /Applications/Microsoft Office 2011/Microsoft Word.app/Contents/MacOS/Microsoft Word -psn_0_2372163\n" +
            "90114   ??  S      0:13.98 /System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/java -d64 -Djava.awt.headless=true -Didea.version==13.1.5 -Xmx512m -Dfile.encoding=UTF-8 -classpath /Appl\n" +
            "91431   ??  S      0:03.22 /Applications/Google Chrome.app/Contents/Versions/42.0.2311.135/Google Chrome Helper.app/Contents/MacOS/Google Chrome Helper --type=renderer --enable-deferred-image-decoding \n" +
            "92678   ??  S      0:00.13 /System/Library/Frameworks/CoreServices.framework/Frameworks/Metadata.framework/Versions/A/Support/mdworker -s mdworker -c MDSImporterWorker -m com.apple.mdworker.single\n" +
            "93657   ??  Ss     0:00.08 /usr/sbin/ocspd\n" +
            " 1202 s000  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1222 s000  S+     0:00.28 -bash\n" +
            " 1203 s001  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1208 s001  S+     0:00.02 -bash\n" +
            " 1204 s002  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1225 s002  S+     0:00.01 -bash\n" +
            " 1205 s003  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1228 s003  S+     0:00.01 -bash\n" +
            " 1206 s004  Ss     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1215 s004  S+     0:00.01 -bash\n" +
            " 1207 s005  Ss     0:00.02 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            " 1210 s005  S+     0:00.02 -bash\n" +
            "51432 s006  Us     0:00.13 login -pf mikhailtyamin\n" +
            "51433 s006  S+     0:00.17 -bash\n" +
            "56701 s007  Us     0:00.06 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "56702 s007  S+     0:00.08 -bash\n" +
            "21932 s008  Ss     0:00.07 login -pf mikhailtyamin\n" +
            "21933 s008  S+     0:00.02 -bash\n" +
            "29904 s009  Ss     0:00.07 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "29905 s009  S+     0:00.05 -bash\n" +
            "74277 s010  Ss     0:00.09 login -pf mikhailtyamin\n" +
            "74278 s010  S+     0:00.25 -bash\n" +
            "90693 s011  Ss     0:00.16 login -pfl mikhailtyamin /bin/bash -c exec -la bash /bin/bash\n" +
            "90694 s011  S      0:00.02 -bash\n" +
            "94103 s011  R+     0:00.00 ps ax");

    private byte[] arr;

    private ProcessOutputConst(String value) {
        this.arr = value.getBytes();
    }

    public byte[] getByteOutputArr() {
        return arr;
    }
}
