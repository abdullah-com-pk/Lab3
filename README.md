# Lab3

Observer Pattern Overview

Understanding the Observer Pattern
The Observer Pattern is a behavioral design model where a main object (referred to as the Subject) manages a collection of dependent objects (Observers) and informs them whenever there is a change in its state.

--Core Elements
- Subject: Keeps track of all observers and updates them when its internal state changes.
- Observer: Establishes a contract that defines how dependent objects respond to notifications.
- Concrete Observers: These are specific implementations of the Observer interface, reacting to changes in the Subject.

-- EventManager Class
The EventManager class handles the process of registering, deregistering, and notifying observers about relevant events.

- Uses a Map Structure: Events are stored along with their corresponding listeners.
- subscribe Method: Attaches a listener to a specific event type.
- unsubscribe Method: Removes a listener from an event type.
- notify Method: Invokes the update method on all observers when an event takes place.

-- Editor Class
The Editor class functions as the primary Subject, which generates and dispatches event notifications through its EventManager.

- openFile: Triggers notifications to alert observers when a file is opened.
- saveFile: Sends notifications to observers when a file is saved.

-- Notification Classes
1. EmailNotificationListener
   - Sends an email when a relevant event, such as opening or saving a file, is triggered.
   - Implements the EventListener interface and defines an update method to output email notifications.

2. LogOpenListener
   - Logs a message to a file when a file-opening event occurs.
   - Implements the EventListener interface and defines an update method for logging actions.

-- Observer Implementations
Observers track changes in the Subject and respond accordingly:

- BinaryObserver: Converts the Subject's state into a binary format and displays it.
- OctalObserver: Translates the Subject's state into an octal representation and outputs it.
- HexaObserver: Represents the Subject's state in a hexadecimal format and prints it.

-- Execution Process
When the Subject's state updates, it notifies all registered observers. Each observer reacts by invoking its update method, ensuring that the system remains synchronized.

-- Demo Class
The Demo class initializes the Observer Pattern workflow by:

1. Setting up the Subject and Observers.
2. Registering observers with the Subject.
3. Triggering state changes to showcase how each observer reacts.

