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

<img src="https://user-images.githubusercontent.com/50905347/181236647-600e6825-a221-4bd3-8834-97ee90a7b2ec.png" width="589" height="300">

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
        implementation 'com.github.commandiron:BubbleNavigationBarCompose:1.0.2'
}
```
