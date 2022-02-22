# plugin-programming-buttons

Programming buttons for smart-ex 02

## Install

```bash
npm install plugin-programming-buttons
npx cap sync
```

## API

<docgen-index>

* [`addListener(...)`](#addlistener)
* [`addListener(...)`](#addlistener)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### addListener(...)

```typescript
addListener(eventName: 'buttonUpPressed', listenerFunc: () => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

| Param              | Type                           |
| ------------------ | ------------------------------ |
| **`eventName`**    | <code>"buttonUpPressed"</code> |
| **`listenerFunc`** | <code>() =&gt; void</code>     |

**Returns:** <code>any</code>

--------------------


### addListener(...)

```typescript
addListener(eventName: 'buttonDownPressed', listenerFunc: () => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

| Param              | Type                             |
| ------------------ | -------------------------------- |
| **`eventName`**    | <code>"buttonDownPressed"</code> |
| **`listenerFunc`** | <code>() =&gt; void</code>       |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### PluginListenerHandle

| Prop         | Type                      |
| ------------ | ------------------------- |
| **`remove`** | <code>() =&gt; any</code> |

</docgen-api>
