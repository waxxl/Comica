# For communication with AdColony's WebView
-keepclassmembers class * { 
    @android.webkit.JavascriptInterface <methods>; 
}