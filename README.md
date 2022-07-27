# BigDecimalVisualTransformationCompose

## Usage
```kotlin  
val bigDecimal = 123456879.12.toBigDecimal()

TextField(
    value = bigDecimal.toString(),
    onValueChange = {},
    visualTransformation = BigDecimalVisualTransformationWithUnit(
        unit = "β",
    )
)

//Also you can use with Text components.

Text(
    text = BigDecimalVisualTransformationWithUnit().getTransformedText(
        text = bigDecimal.toString(),
        addedUnit = "β"
    ),
)
```

## How it looks

<img src="https://user-images.githubusercontent.com/50905347/181237815-40a91ce6-c40f-45e8-8020-ac92250baa7e.png" width="589" height="250">

## Setup
1. Open the file `settings.gradle` (it looks like that)
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // add jitpack here 👇🏽
        maven { url 'https://jitpack.io' }
       ...
    }
} 
...
```
2. Sync the project
3. Add dependency
```groovy
dependencies {
        implementation 'com.github.commandiron:BigDecimalVisualTransformationCompose:1.0.0'
}
```
