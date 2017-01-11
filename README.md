# ADFClientSideEventBus
Prototype and demo for client side event pub/sub mechanism across regions and fragments

This ADF Web project (for release 12.2.1) demonstrates a client side event bus mechanism. Client side events in one area in the web page (potentially from a fragment in a nested taskflow) are published to a page wide event bus.

Any page fragment in any (deeply nested) taskflow can register a JavaScript callback function as listener for client side events of a specific type.

When a client side event is published - all registered consumers (callback functions) are invoked; they receive the event's payload a to do with as they see fit.

The event consumers can so several things including:
- manipulate (synchronize/update) client side components
- trigger a partial refresh for a certain section of the page
- send an event to the server on behalf of the consuming fragment/taskflow

Note: this client side event bus strives to be a mechanism that is simpler, leaner and smoother and more straightforward in certain situations than the Contextual Events framework that is the formal way of handling events across tasfklows.

This mechanism uses some simple JavaScript. It does not use the ADF Binding layer. It does not require any third party libraries.
