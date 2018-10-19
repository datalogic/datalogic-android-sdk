package com.datalogic.decode;

/**
 * This interface is used by the application to listen to the decoder's read event.
 * This is intended to be used with the <code>addReadListener</code> method of the <code>BarcodeManager</code> class.
 * More than one object instance can listen to the decoding events in an application.
 * More than one application can listen to decoding events in the system.
 * <br><br>Code snippet for Android:<br><br>
 * <code>    import com.datalogic.decode.*;</code><br>
 * <code>    // import also other packages needed to compile your app</code><br>
 *
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 * normal;mso-layout-grid-align:none;text-autospace:none">
 *        <b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 * EN-US">public</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 * &quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 * EN-US">class</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 * &quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> MainActivity </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 * mso-ansi-language:EN-US">extends</span></b><span lang="EN-US" style="font-size:
 * 10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> 
 *        Activity {</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;
 * mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 * normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 * EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span>
 *        <span lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p>
 *        </span>
 *    </p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>BarcodeManager
 *        </span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">decoder</span><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> = </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">null</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">;</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>TextView
 *        </span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">mBarcodeText</span><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">;</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p>
 *        &nbsp;</o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#646464;mso-ansi-language:
 *EN-US">@Override</span><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 *EN-US">protected</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 *EN-US">void</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> onCreate(Bundle 
 *        savedInstanceState) {</span><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">super</span></b><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">.<span 
 *            style="background: silver; mso-highlight: silver">onCreate</span>(savedInstanceState);</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>setContentView(R.layout.</span><i><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">activity_main</span></i><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US">);</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;
 *mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">mBarcodeText</span><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> = 
 *        (TextView)findViewById(R.id.</span><i><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:#0000C0;mso-ansi-language:EN-US">editText1</span></i><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;
 *mso-ansi-language:EN-US">);</span><o:p></o:p></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <o:p></o:p>
 *    </p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">try</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> {</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">if</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> (</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">decoder</span><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">==</span><b><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">null</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">) {</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">decoder</span><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> = </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">new</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> 
 *        BarcodeManager();</span><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">decoder<span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">.addReadListener(</span></span><b><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">new</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> ReadListener() 
 *        {</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;
 *mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#646464;
 *mso-ansi-language:EN-US">@Override</span><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">public</span></b><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> </span>
 *        <b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">void</span></b><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> 
 *        onRead(DecodeResult decodeResult) {</span><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:7">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
  <span lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:7">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">mBarcodeText</span><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">.setText(decodeResult.getText());</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>}</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span>
 *    </p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:5">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>};</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">);</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>}</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span>
 *    </p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>} </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;
 *mso-ansi-language:EN-US">catch</span></b><span lang="EN-US" style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> 
 *        (DecodeException e) {</span><span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span>
 *        <span lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>e.printStackTrace();</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>}</span><span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        &nbsp;</p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>}</span><span 
 *            lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p>
 *        &nbsp;</o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#646464;mso-ansi-language:
 *EN-US">@Override</span><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;mso-ansi-language:EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-spacerun:yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span></span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 *EN-US">protected</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> </span><b>
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055;mso-ansi-language:
 *EN-US">void</span></b><span lang="EN-US" style="font-size:10.0pt;font-family:
 *&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US"> onDestroy() {</span><span 
 *            lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;mso-ansi-language:
 *EN-US"><o:p></o:p></span></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:
 *EN-US"><span style="mso-tab-count:2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span></span><b>
 *        <span style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#7F0055">
 *        super</span></b><span 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:black">.onDestroy();</span><o:p></o:p></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <o:p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        <span lang="EN-US" style="font-size:10.0pt;font-family:&quot;Courier New&quot;;color:#0000C0;
 *mso-ansi-language:EN-US">decoder<span lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">.release(</span></span><span 
 *            lang="EN-US" style="font-size:10.0pt;
 *font-family:&quot;Courier New&quot;;color:black;mso-ansi-language:EN-US">);</span></o:p></p>
 *    <p class="MsoNormal" style="margin-bottom:0cm;margin-bottom:.0001pt;line-height:
 *normal;mso-layout-grid-align:none;text-autospace:none">
 *        <span style="font-size:
 *10.0pt;font-family:&quot;Courier New&quot;;color:black"><span style="mso-tab-count:1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
 *        </span>}</span><span 
 *            style="font-size:10.0pt;font-family:&quot;Courier New&quot;"><o:p></o:p></span></p>
 *    <p class="MsoNormal">
 *        <span style="font-size:10.0pt;line-height:115%;font-family:
 *&quot;Courier New&quot;;color:black">}</span><o:p></o:p></p>
 *
 * @see com.datalogic.decode.BarcodeManager
 *
 *
 */
public interface ReadListener {

	/**
	 * onRead method will be called when a good read event is fired.
	 * 
	 * @param decodeResult
	 *            The data read as defined by {@link DecodeResult}
	 * 
	 * @see com.datalogic.decode.DecodeResult
	 */
	public void onRead(DecodeResult decodeResult);
}
