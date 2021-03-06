package def.dom;
@jsweet.lang.Extends({DocumentEvent.class,SVGLocatable.class,SVGTests.class,SVGStylable.class,SVGLangSpace.class,SVGExternalResourcesRequired.class,SVGFitToViewBox.class,SVGZoomAndPan.class})
public class SVGSVGElement extends SVGElement {
    public String contentScriptType;
    public String contentStyleType;
    public double currentScale;
    public SVGPoint currentTranslate;
    public SVGAnimatedLength height;
    public java.util.function.Function<Event,Object> onabort;
    public java.util.function.Function<Event,Object> onerror;
    public java.util.function.Function<UIEvent,Object> onresize;
    public java.util.function.Function<UIEvent,Object> onscroll;
    public java.util.function.Function<Event,Object> onunload;
    public java.util.function.Function<SVGZoomEvent,Object> onzoom;
    public double pixelUnitToMillimeterX;
    public double pixelUnitToMillimeterY;
    public double screenPixelToMillimeterX;
    public double screenPixelToMillimeterY;
    public SVGRect viewport;
    public SVGAnimatedLength width;
    public SVGAnimatedLength x;
    public SVGAnimatedLength y;
    native public Boolean checkEnclosure(SVGElement element, SVGRect rect);
    native public Boolean checkIntersection(SVGElement element, SVGRect rect);
    native public SVGAngle createSVGAngle();
    native public SVGLength createSVGLength();
    native public SVGMatrix createSVGMatrix();
    native public SVGNumber createSVGNumber();
    native public SVGPoint createSVGPoint();
    native public SVGRect createSVGRect();
    native public SVGTransform createSVGTransform();
    native public SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    native public void deselectAll();
    native public void forceRedraw();
    native public CSSStyleDeclaration getComputedStyle(Element elt, String pseudoElt);
    native public double getCurrentTime();
    native public Element getElementById(String elementId);
    native public NodeList getEnclosureList(SVGRect rect, SVGElement referenceElement);
    native public NodeList getIntersectionList(SVGRect rect, SVGElement referenceElement);
    native public void pauseAnimations();
    native public void setCurrentTime(double seconds);
    native public double suspendRedraw(double maxWaitMilliseconds);
    native public void unpauseAnimations();
    native public void unsuspendRedraw(double suspendHandleID);
    native public void unsuspendRedrawAll();
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.SVGAbort type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.SVGError type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.SVGUnload type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.SVGZoom type, java.util.function.Function<SVGZoomEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.click type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.dblclick type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.focusin type, java.util.function.Function<FocusEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.focusout type, java.util.function.Function<FocusEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mousedown type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mousemove type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseout type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseover type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.mouseup type, java.util.function.Function<MouseEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.resize type, java.util.function.Function<UIEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.scroll type, java.util.function.Function<UIEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,Object> listener, Boolean useCapture);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,Object> listener, Boolean useCapture);
    native public void addEventListener(String type, EventListener listener, Boolean useCapture);
    public static SVGSVGElement prototype;
    public SVGSVGElement(){}
    native public AnimationEvent createEvent(jsweet.util.StringTypes.AnimationEvent eventInterface);
    native public AriaRequestEvent createEvent(jsweet.util.StringTypes.AriaRequestEvent eventInterface);
    native public AudioProcessingEvent createEvent(jsweet.util.StringTypes.AudioProcessingEvent eventInterface);
    native public BeforeUnloadEvent createEvent(jsweet.util.StringTypes.BeforeUnloadEvent eventInterface);
    native public ClipboardEvent createEvent(jsweet.util.StringTypes.ClipboardEvent eventInterface);
    native public CloseEvent createEvent(jsweet.util.StringTypes.CloseEvent eventInterface);
    native public CommandEvent createEvent(jsweet.util.StringTypes.CommandEvent eventInterface);
    native public CompositionEvent createEvent(jsweet.util.StringTypes.CompositionEvent eventInterface);
    native public CustomEvent createEvent(jsweet.util.StringTypes.CustomEvent eventInterface);
    native public DeviceMotionEvent createEvent(jsweet.util.StringTypes.DeviceMotionEvent eventInterface);
    native public DeviceOrientationEvent createEvent(jsweet.util.StringTypes.DeviceOrientationEvent eventInterface);
    native public DragEvent createEvent(jsweet.util.StringTypes.DragEvent eventInterface);
    native public ErrorEvent createEvent(jsweet.util.StringTypes.ErrorEvent eventInterface);
    native public Event createEvent(jsweet.util.StringTypes.Event eventInterface);
    native public Event createEvent(jsweet.util.StringTypes.Events eventInterface);
    native public FocusEvent createEvent(jsweet.util.StringTypes.FocusEvent eventInterface);
    native public GamepadEvent createEvent(jsweet.util.StringTypes.GamepadEvent eventInterface);
    native public HashChangeEvent createEvent(jsweet.util.StringTypes.HashChangeEvent eventInterface);
    native public IDBVersionChangeEvent createEvent(jsweet.util.StringTypes.IDBVersionChangeEvent eventInterface);
    native public KeyboardEvent createEvent(jsweet.util.StringTypes.KeyboardEvent eventInterface);
    native public LongRunningScriptDetectedEvent createEvent(jsweet.util.StringTypes.LongRunningScriptDetectedEvent eventInterface);
    native public MSGestureEvent createEvent(jsweet.util.StringTypes.MSGestureEvent eventInterface);
    native public MSManipulationEvent createEvent(jsweet.util.StringTypes.MSManipulationEvent eventInterface);
    native public MSMediaKeyMessageEvent createEvent(jsweet.util.StringTypes.MSMediaKeyMessageEvent eventInterface);
    native public MSMediaKeyNeededEvent createEvent(jsweet.util.StringTypes.MSMediaKeyNeededEvent eventInterface);
    native public MSPointerEvent createEvent(jsweet.util.StringTypes.MSPointerEvent eventInterface);
    native public MSSiteModeEvent createEvent(jsweet.util.StringTypes.MSSiteModeEvent eventInterface);
    native public MessageEvent createEvent(jsweet.util.StringTypes.MessageEvent eventInterface);
    native public MouseEvent createEvent(jsweet.util.StringTypes.MouseEvent eventInterface);
    native public MouseEvent createEvent(jsweet.util.StringTypes.MouseEvents eventInterface);
    native public MouseWheelEvent createEvent(jsweet.util.StringTypes.MouseWheelEvent eventInterface);
    native public MutationEvent createEvent(jsweet.util.StringTypes.MutationEvent eventInterface);
    native public MutationEvent createEvent(jsweet.util.StringTypes.MutationEvents eventInterface);
    native public NavigationCompletedEvent createEvent(jsweet.util.StringTypes.NavigationCompletedEvent eventInterface);
    native public NavigationEvent createEvent(jsweet.util.StringTypes.NavigationEvent eventInterface);
    native public NavigationEventWithReferrer createEvent(jsweet.util.StringTypes.NavigationEventWithReferrer eventInterface);
    native public OfflineAudioCompletionEvent createEvent(jsweet.util.StringTypes.OfflineAudioCompletionEvent eventInterface);
    native public PageTransitionEvent createEvent(jsweet.util.StringTypes.PageTransitionEvent eventInterface);
    native public PermissionRequestedEvent createEvent(jsweet.util.StringTypes.PermissionRequestedEvent eventInterface);
    native public PointerEvent createEvent(jsweet.util.StringTypes.PointerEvent eventInterface);
    native public PopStateEvent createEvent(jsweet.util.StringTypes.PopStateEvent eventInterface);
    native public ProgressEvent createEvent(jsweet.util.StringTypes.ProgressEvent eventInterface);
    native public SVGZoomEvent createEvent(jsweet.util.StringTypes.SVGZoomEvent eventInterface);
    native public SVGZoomEvent createEvent(jsweet.util.StringTypes.SVGZoomEvents eventInterface);
    native public ScriptNotifyEvent createEvent(jsweet.util.StringTypes.ScriptNotifyEvent eventInterface);
    native public StorageEvent createEvent(jsweet.util.StringTypes.StorageEvent eventInterface);
    native public TextEvent createEvent(jsweet.util.StringTypes.TextEvent eventInterface);
    native public TouchEvent createEvent(jsweet.util.StringTypes.TouchEvent eventInterface);
    native public TrackEvent createEvent(jsweet.util.StringTypes.TrackEvent eventInterface);
    native public TransitionEvent createEvent(jsweet.util.StringTypes.TransitionEvent eventInterface);
    native public UIEvent createEvent(jsweet.util.StringTypes.UIEvent eventInterface);
    native public UIEvent createEvent(jsweet.util.StringTypes.UIEvents eventInterface);
    native public UnviewableContentIdentifiedEvent createEvent(jsweet.util.StringTypes.UnviewableContentIdentifiedEvent eventInterface);
    native public WebGLContextEvent createEvent(jsweet.util.StringTypes.WebGLContextEvent eventInterface);
    native public WheelEvent createEvent(jsweet.util.StringTypes.WheelEvent eventInterface);
    native public Event createEvent(String eventInterface);
    public SVGElement farthestViewportElement;
    public SVGElement nearestViewportElement;
    native public SVGRect getBBox();
    native public SVGMatrix getCTM();
    native public SVGMatrix getScreenCTM();
    native public SVGMatrix getTransformToElement(SVGElement element);
    public SVGStringList requiredExtensions;
    public SVGStringList requiredFeatures;
    public SVGStringList systemLanguage;
    native public Boolean hasExtension(String extension);
    public Object className;
    public CSSStyleDeclaration style;
    public String xmllang;
    public String xmlspace;
    public SVGAnimatedBoolean externalResourcesRequired;
    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;
    public SVGAnimatedRect viewBox;
    public double zoomAndPan;
    public static double SVG_ZOOMANDPAN_DISABLE;
    public static double SVG_ZOOMANDPAN_MAGNIFY;
    public static double SVG_ZOOMANDPAN_UNKNOWN;
    native public CSSStyleDeclaration getComputedStyle(Element elt);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureChange type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureDoubleTap type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureEnd type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureHold type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureStart type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGestureTap type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSGotPointerCapture type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSInertiaStart type, java.util.function.Function<MSGestureEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSLostPointerCapture type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerCancel type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerDown type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerEnter type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerLeave type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerMove type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOut type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerOver type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.MSPointerUp type, java.util.function.Function<MSPointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.SVGAbort type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.SVGError type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.SVGUnload type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.SVGZoom type, java.util.function.Function<SVGZoomEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.ariarequest type, java.util.function.Function<AriaRequestEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.click type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.command type, java.util.function.Function<CommandEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.dblclick type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.focusin type, java.util.function.Function<FocusEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.focusout type, java.util.function.Function<FocusEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.gotpointercapture type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.load type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.lostpointercapture type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mousedown type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mousemove type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseout type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseover type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.mouseup type, java.util.function.Function<MouseEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointercancel type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerdown type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerenter type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerleave type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointermove type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerout type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerover type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.pointerup type, java.util.function.Function<PointerEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.resize type, java.util.function.Function<UIEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.scroll type, java.util.function.Function<UIEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchcancel type, java.util.function.Function<TouchEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchend type, java.util.function.Function<TouchEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchmove type, java.util.function.Function<TouchEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.touchstart type, java.util.function.Function<TouchEvent,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenchange type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.webkitfullscreenerror type, java.util.function.Function<Event,Object> listener);
    native public void addEventListener(jsweet.util.StringTypes.wheel type, java.util.function.Function<WheelEvent,Object> listener);
    native public void addEventListener(String type, EventListener listener);
    native public void addEventListener(String type, EventListenerObject listener, Boolean useCapture);
    native public void addEventListener(String type, EventListenerObject listener);
}

