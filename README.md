# E-Commerce - Everything at tip of your finger

## About

A simple e-commerce app that connects local retailers with people around

<p>
<img src="https://github.com/stymsaw/Ecommerce/blob/master/assets/Screenshot_1733990595.png?raw=true" height="500" width="250">
<img src="https://github.com/stymsaw/Ecommerce/blob/master/assets/Screenshot_1733990602.png?raw=true" height="500" width="250">
<img src="https://github.com/stymsaw/Ecommerce/blob/master/assets/Screenshot_1733990632.png?raw=true" height="500" width="250">
</p>

- MVVM architecture
- Clean and Simple Material UI.
- [Platzi Fake Store API](https://fakeapi.platzi.com/) API is used in this app.

## Built With 🛠

- [Kotlin](https://kotlinlang.org/) - A programming language for Android development.
- [Jetpack Compose](https://developer.android.com/jetpack/compose) - For Ui Components
- [Coroutine](https://developer.android.com/kotlin/coroutines) - For asynchronous and more..
- [Flow](https://developer.android.com/kotlin/flow) - For stream data that asynchronously
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) -
  Collection of libraries that help you design robust, testable, and maintainable apps.
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Data objects
      that notify views when the underlying database changes.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores
      UI-related data that isn't destroyed on UI changes.
- [Dependency Injection](https://developer.android.com/training/dependency-injection)
- [Retrofit](https://github.com/amitshekhariitbhu/Fast-Android-Networking) - A Complete Fast Android
  Networking Library that also supports HTTP/2.
- [Gson](https://github.com/google/gson) - A modern JSON library for Kotlin and Java.
- [Glide](https://github.com/bumptech/glide) - An image loading and caching library for Android
  focused on smooth scrolling.
- [Material Components for Android](https://github.com/material-components/material-components-android) -
  Modular and customizable Material Design UI components for Android.
- [Lottie Animation]([https://github.com/material-components/material-components-android](https://lottiefiles.com/)) -
  Cool Animations in an Android App.

# Package Structure

    ├── data                # For data handling.
    │   ├── remote          # Remote Data Handlers     
    │   ├── model           # Model classes
    |   │   ├── api         # Model classes for Api
    │   └── repository      # Single source of data.
    |
    ├── navigation          # PArent Navhost for navigation  
    |
    |
    ├── ui                  # Activity/View layer
    │   ├── base            # Base View
    │   ├── custom          # Custom Views
    │   ├── home screen     # Homescreen components and ViewModel
    │   ├── productdetails  # Product details and ViewModel
    │   ├── searchscreen    # Searchscreen and ViewModel
    │   ├── splashscreen    # Splashscreen 
    │   └──  theme           # App themeing details
  
## License

```
MIT License

Copyright (c) 2023 Satyam Saw

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
