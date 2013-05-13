<table>
<tr>
<th>Topic Area</th>
<th>Talking</th>
<th>Typing</th>
<th>Time</th>
</tr>
<tr>
<td>
Intro talk during setup
<ul>
<li>Start developer mode on tablet.</li>
<li>Start tethering on tablet.</li>
<li>Start droidVnc on tablet.</li>
<li>Connect Chicken of the VNC to tablet, port 1.</li>
<li>Connect adb on port 5555.</li>
<li>F: Give intro to Android development, developer goals, design requirements, etc.</li>
</ul>
</td>
<td>Fiona</td>
<td>Andrew</td>
<td>3</td>
</tr>
<tr>
<td>
Create projects & directories
<ul>
<li>Note: Do not use numbers in any names, references or IDs.</li>
<li>A: New Project, "AndroidAnnotations", Android 4.2.2 Platform. Activity name "InputMessageActivity".</li>
<li>A: Target Device should be "USB Device". ADB wil bridge the TCP/IP for us.</li>
<li>A: Set up Android Annotations annotation processor. Specify Processor Path, export to "gen" relative to module content root. (androidannotations)</li>
<li>A: Set up Android Annotations library module import (androidannotations-api).</li>
<li>A: Android Manifest. Change minimumSdkVersion to 15.</li>
</ul>
</td>
<td>Fiona</td>
<td>Andrew</td>
<td>2</td>
</tr>
<tr>
<td>
"Input Message Activity" .xml
<ul>
<li>F: Draw bubble diagram of activity layout. Include inheritence key.</li>
<li>Double-Click textView, modify text to "Enter a message"</li>
<li>Set "All Padding" to 16dp</li>
<li>Set "Text Size" to 20dp</li>
<li>Drag on EditText, remove text content</li>
<li>FC: Explain Android ID lookups</li>
<li>Drag on Button, set text to "Send"</li>
</ul>
</td>
<td>Fiona</td>
<td>Andrew</td>
<td>5</td>
</tr>
<tr>
<td>
"Input Message Activity" .java
<ul>
<li>A: Introduce method call concepts</li>
<li>Remove onCreate method, replace "setContentView" with an @EActivity annotation.</li>
<li>Change references to InputMessageActivity to InputMessageActivity_.</li>
<li>Run a build to demonstrate Android Annotations compilation.</li>
<li>Add protected EditText field called editText (same as ID identified in xml) and include @ViewById annotation.</li>
<li>Add protected void method called button (same ID as identified in xml) and include @Click annotation.</li>
<li>Add code to method for creating a new Intent, referring to DisplayMessageActivity. Create the class when prompted.</li>
<li>Set "extra" String on the intent, using a key "message" (refactor this to a class variable) and a value from editText.getText().</li>
<li>invoke startActivity, pass in intent.</li>
</ul>
</td>
<td>Andrew</td>
<td>Fiona</td>
<td>3</td>
</tr>
<tr>
<td>
"Display Message Activity" .java
<ul>
<li>Navigate to DisplayMessageActivity, add @EActivity annotation.</li>
<li>Add DisplayMessageActivity_ to Android Manifest.</li>
<li>Set parent activity to InputMessageActivity_. Set label to String literal, then refactor title to strings.xml</li>
<li>Change references to DisplayMessageActivity to DisplayMessageActivity_.</li>
<li>Navigate back to DisplayMessageActivity. Override onCreate method.</li>
<li>Get intent using getIntent()</li>
<li>Get String content using getStringExtra()</li>
<li>Create new TextView element, pass in the message as text. Call setContentView, passing in the TextView.</li>
<li>Navigate to onCreate, insert line requesting access to the ActionBar and setting "display" as "up" to be true.</li>
</ul>
</td>
<td>Fiona</td>
<td>Andrew</td>
<td>2</td>
</tr>
<tr>
<td>
"Display Message Activity" .java (back button)
</td>
<td>Fiona</td>
<td>Andrew</td>
<td>3</td>
</tr>
<tr>
<td>
Deployment
</td>
<td>Andrew</td>
<td>Fiona</td>
<td>1</td>
</tr>
<tr>
<td>
Demo & Questions
<ul>
<li>F: If not asked already, ask a question that brings us to developer.android.com design guide</li>
<li>F: If not asked already, ask about how to get involved in the Android scene, meeting other devs, etc.</li>
<li>A: Discuss what is next. Upcoming Dumplings app.</li>
</ul>
</td>
<td>Andrew</td>
<td>Fiona</td>
<td>4+</td>
</tr>
</table>
