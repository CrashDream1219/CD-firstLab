# CD-firstLab: DUI sample based on OpenHarmony

This lab implements a simple example of distributed user interface(DUI) based on OpenHarmony Codelab 'DistributedVideoCodelab'. In this lab, we will indicate a general model which could help developers to standardize DUI programming and reduce their workload. 

The main points of this lab:
- The role of DuiAgent
- Interface selector
- ColorBlindSelector

# Some explanation about code
1. Code structure interpretation
```
└── java                            
    └── component     
    ├── data        
    │── duiagent  
    │   └── ColorBlindSelector.java 
    │   └── DuiAgent.java        
    │   └── DuiComponent.java
    │   └── DuiViewProvider.java
    │   └── FirstProvider.java
    │   └── PresetTable.java
    │   └── SecondItem.java
    │   └── SecondProvider.java
    │   └── Selector.java  
    │── manager.idl
    │── player
    │── provider
    │── slice
    │── util
    │── MainAbility.java
    │── PlayerAbility.java
    └── VideoMigrateService.java
```
For details about the code body, see Huawei official documents. https://developer.huawei.com/consumer/cn/codelabsPortal/carddetails/HarmonyOS-DistributedVideo

The package 'duiagent' is a plug-in which we added to original code. Since the provider like 'DuiViewProvider', 'FirstProvider' and 'SecondProvider' are OpenHarmony built-in components, so we just focus on the .class file 'ColorBlindSelector' and 'Duiagent', and .interface file 'Selector'.

2. The role of DuiAgent
'DuiAgent' could be viewed as a carrier to transmit various DUI information and regulate DUI system action. The system can implement corresponding actions through the information carried by the DUI agent. For instance, this lab shows how users can choose different UIs depending on their needs while streaming the video, and then the agent carries the information including target device identifier and selected UI scheme.

3. Interface Selector
It is a outward interface for customization, standardize the design of multi-device cooperation and build up feasible distribution model facilitating the operation of DUI function implemented application.

4. ColorBlindSelector
Since we hope the DUI could be customized based on users different requirements, so developers could add more selectors to deal with complex situations. And 'ColorBlindSelector' is a sample selector which provide color blind user with button color selection. 

# More detail about our project
You could get more detail about our idea through our paper.
