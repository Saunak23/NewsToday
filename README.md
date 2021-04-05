# NewsToday

<h2> Recycler View </h2>




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

<h2> Custom Chrome Tabs </h2>
Custom Tabs is a browser feature, introduced by Chrome, that is now supported by most major browsers on Android. It give apps more control over their web experience, and make transitions between native and web content more seamless without having to resort to a WebView.









