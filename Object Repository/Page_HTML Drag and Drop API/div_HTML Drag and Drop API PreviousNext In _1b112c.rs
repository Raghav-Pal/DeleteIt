<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_HTML Drag and Drop API PreviousNext In _1b112c</name>
   <tag></tag>
   <elementGuidId>42651808-f35b-4bab-87c8-f6898c09c516</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='main']</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>w3-col l10 m12</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>main</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      
        

        
        
        
       
      

HTML Drag and Drop API

❮ Previous
Next ❯


In HTML, any element can be dragged and dropped.


Example



Drag the W3Schools image into the rectangle.


Drag and Drop
Drag and drop is a very common feature. It is when you &quot;grab&quot; an object and drag it to a different location.


Browser Support
The numbers in the table specify the first browser version that fully supports Drag and Drop.

  
    API
    
    
    
    
                    
  
  
    Drag and Drop
    4.0
    9.0
    3.5
    6.0
    12.0
  



HTML Drag and Drop Example
The example below is a simple drag and drop example:

Example

 &lt;!DOCTYPE HTML>
 &lt;html>
 &lt;head>
 &lt;script>
 function allowDrop(ev)
 {
   ev.preventDefault();
 }
 
 function drag(ev)
 {
   
 ev.dataTransfer.setData(&quot;text&quot;, ev.target.id);
 }
 
 function drop(ev)
 {
   
 ev.preventDefault();
   var data = ev.dataTransfer.getData(&quot;text&quot;);
   ev.target.appendChild(document.getElementById(data));
 }
 &lt;/script>
 &lt;/head>
 &lt;body>
 
 &lt;div id=&quot;div1&quot; ondrop=&quot;drop(event)&quot;
 ondragover=&quot;allowDrop(event)&quot;>&lt;/div>
 
 &lt;img id=&quot;drag1&quot; src=&quot;img_logo.gif&quot; draggable=&quot;true&quot;
 ondragstart=&quot;drag(event)&quot; width=&quot;336&quot; height=&quot;69&quot;>
 
 &lt;/body>
 &lt;/html> 
Try it Yourself »
It might seem complicated, but lets go through all the different parts of a drag and drop event.




  
  




Make an Element Draggable
First of all: To make an element draggable, set the draggable attribute to true:

 &lt;img draggable=&quot;true&quot;> 


What to Drag - ondragstart and setData()
Then, specify what should happen when the element is dragged.
In the example above, the ondragstart attribute calls a function, drag(event), 
that specifies what data to be dragged.
The dataTransfer.setData() method sets the data type and the value of the 
dragged data:


function drag(ev) {  ev.dataTransfer.setData(&quot;text&quot;, ev.target.id);
}
 
In this case, the data type is &quot;text&quot; and the value is the id of the draggable element (&quot;drag1&quot;).


Where to Drop - ondragover
The ondragover event specifies where the dragged data can be dropped.
By default, data/elements cannot be dropped in other elements. To allow a drop, 
we must prevent the default handling of the element.
This is done by calling the event.preventDefault() method for the ondragover event:

 
  event.preventDefault()
 


Do the Drop - ondrop
When the dragged data is dropped, a drop event occurs.
In the example above, the ondrop attribute calls a function, drop(event):

 
  function drop(ev)
 {
    
 ev.preventDefault();
    
 var data = ev.dataTransfer.getData(&quot;text&quot;);
    
 ev.target.appendChild(document.getElementById(data));
 }
 
Code explained:

  Call preventDefault() to prevent the browser default handling of the data (default is open as link on drop)
  Get the dragged data with the dataTransfer.getData() method. This method will return any data that was set to the same type in the setData() method
  The dragged data is the id of the dragged element (&quot;drag1&quot;)
  Append the dragged element into the drop element


More Examples

Example
How to drag (and drop) an image back and forth between two &lt;div> elements:


Try it Yourself »



❮ Previous
Next ❯

</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;main&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='main']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='belowtopnav']/div/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Keyboard Shortcuts'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='PX to EM Converter'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[6]/div/div</value>
   </webElementXpaths>
</WebElementEntity>
