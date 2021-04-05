# NewsToday

<h2> Recycler View </h2>

![Screenshot (88)](https://user-images.githubusercontent.com/71092350/113614744-8104a180-9670-11eb-83dd-65a47bfae458.png)



RecyclerView is a ViewGroup added to the android studio as a successor of the GridView and ListView. It is an improvement on both of them and can be found in the latest v-7 support packages. It has been created to make possible construction of any lists with **XML layouts** as an item which can be customized vastly while improving on the efficiency of ListViews and GridViews. This improvement is achieved by recycling the views which are out of the visibility of the user.

**Implementation:-** To implement a basic RecyclerView three sub-parts are needed to be constructed which offer the users the degree of control they require in making varying designs of their choice.

**The Card Layout:-**  The card layout is an XML layout which will be treated as an item for the list created by the RecyclerView.

**The ViewHolder:-** The ViewHolder is a java class that stores the reference to the card layout views that have to be dynamically modified during the execution of the program by a list of data obtained either by online databases or added in some other way.

**The Data Class:-** The Data class is a custom java class that acts as a structure for holding the information for every item of the RecyclerView.

<h2> Adapter </h2>
The adapter is the main code responsible for RecyclerView. It holds all the important methods dealing with the implementation of RecyclerView. The basic methods for a successful implementation are:

**onCreateViewHolder:-** It deals with the inflation of the card layout as an item for the RecyclerView.

**onBindViewHolder:-** It deals with the setting of different data and methods related to clicks on particular items of the RecyclerView.

**getItemCount:-** It Returns the length of the RecyclerView.

**onAttachedToRecyclerView:-** It attaches the adapter to the RecyclerView.

<h3> Types of Adapter </h3>
**BaseAdapter** – BaseAdapter is the parent adapter for the rest of the Adapters.

**CursorAdapter** – This adapter makes it easy and more controlled to access the binding of data values.

**ArrayAdapter** – ArrayAdapter presents the items in a single list backed by an array.

**Custom ArrayAdapter** – It displays the custom list of an Array.

**SimpleAdapter** – SimpleAdapter is an easy adapter to map static data to the views through the XML file.

**Custom SimpleAdapter** – It displays a customized list and enables us to access the child data of the list or grid view.
![Screenshot (90)](https://user-images.githubusercontent.com/71092350/113615771-ea38e480-9671-11eb-8b3a-a07b04b80552.png)

<h2> Custom Chrome Tabs </h2>
Custom Tabs is a browser feature, introduced by Chrome, that is now supported by most major browsers on Android. It give apps more control over their web experience, and make transitions between native and web content more seamless without having to resort to a WebView.









