package jp.co.training.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.16.1" }, date = "2018-02-02T16:22:55.403+0900")
public final class _User extends org.seasar.doma.jdbc.entity.AbstractEntityType<jp.co.training.entity.User> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.16.1");
    }

    private static final _User __singleton = new _User();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("users_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.training.entity.User, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(jp.co.training.entity.User.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "id", __namingType, false, __idGenerator);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.training.entity.User, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.training.entity.User.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "name", __namingType, true, true, false);

    /** the email */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.training.entity.User, java.lang.String, Object> $email = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.training.entity.User.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "email", "email", __namingType, true, true, false);

    /** the password */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.training.entity.User, java.lang.String, Object> $password = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.training.entity.User.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "password", "password", __namingType, true, true, false);

    /** the remarks */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, jp.co.training.entity.User, java.lang.String, Object> $remarks = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(jp.co.training.entity.User.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "remarks", "remarks", __namingType, true, true, false);

    private final java.util.function.Supplier<jp.co.training.entity.UserListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __entityPropertyTypeMap;

    private _User() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "User";
        __catalogName = "";
        __schemaName = "";
        __tableName = "users";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($name);
        __map.put("name", $name);
        __list.add($email);
        __map.put("email", $email);
        __list.add($password);
        __map.put("password", $password);
        __list.add($remarks);
        __map.put("remarks", $remarks);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PreInsertContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PreUpdateContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PreDeleteContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PostInsertContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PostUpdateContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(jp.co.training.entity.User entity, org.seasar.doma.jdbc.entity.PostDeleteContext<jp.co.training.entity.User> context) {
        Class __listenerClass = jp.co.training.entity.UserListener.class;
        jp.co.training.entity.UserListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<jp.co.training.entity.User, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, jp.co.training.entity.User, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, jp.co.training.entity.User, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public jp.co.training.entity.User newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<jp.co.training.entity.User, ?>> __args) {
        jp.co.training.entity.User entity = new jp.co.training.entity.User();
        if (__args.get("id") != null) __args.get("id").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("email") != null) __args.get("email").save(entity);
        if (__args.get("password") != null) __args.get("password").save(entity);
        if (__args.get("remarks") != null) __args.get("remarks").save(entity);
        return entity;
    }

    @Override
    public Class<jp.co.training.entity.User> getEntityClass() {
        return jp.co.training.entity.User.class;
    }

    @Override
    public jp.co.training.entity.User getOriginalStates(jp.co.training.entity.User __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(jp.co.training.entity.User __entity) {
    }

    /**
     * @return the singleton
     */
    public static _User getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _User newInstance() {
        return new _User();
    }

    private static class ListenerHolder {
        private static jp.co.training.entity.UserListener listener = new jp.co.training.entity.UserListener();
    }

}
