# plugin-programming-buttons

Programming buttons for smart-ex 02

## Install

```bash
npm install plugin-programming-buttons
npx cap sync
```

## API

<docgen-index>

* [`setVolumeButtonsMode(...)`](#setvolumebuttonsmode)
* [`setMaxVolumeForNotifications()`](#setmaxvolumefornotifications)
* [`addListener(...)`](#addlistener)
* [`addListener(...)`](#addlistener)
* [`addListener(...)`](#addlistener)
* [`addListener(...)`](#addlistener)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### setVolumeButtonsMode(...)

```typescript
setVolumeButtonsMode(options: { changeVolume: boolean; }) => any
```

| Param         | Type                                    |
| ------------- | --------------------------------------- |
| **`options`** | <code>{ changeVolume: boolean; }</code> |

**Returns:** <code>any</code>

--------------------


### setMaxVolumeForNotifications()

```typescript
setMaxVolumeForNotifications() => any
```

**Returns:** <code>any</code>

--------------------


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


### addListener(...)

```typescript
addListener(eventName: 'buttonPttPressed', listenerFunc: () => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

| Param              | Type                            |
| ------------------ | ------------------------------- |
| **`eventName`**    | <code>"buttonPttPressed"</code> |
| **`listenerFunc`** | <code>() =&gt; void</code>      |

**Returns:** <code>any</code>

--------------------


### addListener(...)

```typescript
addListener(eventName: 'buttonSosPressed', listenerFunc: () => void) => Promise<PluginListenerHandle> & PluginListenerHandle
```

| Param              | Type                            |
| ------------------ | ------------------------------- |
| **`eventName`**    | <code>"buttonSosPressed"</code> |
| **`listenerFunc`** | <code>() =&gt; void</code>      |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### PluginListenerHandle

| Prop         | Type                      |
| ------------ | ------------------------- |
| **`remove`** | <code>() =&gt; any</code> |

</docgen-api>
