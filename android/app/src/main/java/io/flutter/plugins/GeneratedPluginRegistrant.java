package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.maru.twitter_login.TwitterLoginPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    InAppWebViewFlutterPlugin.registerWith(registry.registrarFor("com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin"));
    TwitterLoginPlugin.registerWith(registry.registrarFor("com.maru.twitter_login.TwitterLoginPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
