# Food Runner

A food-ordering Android app written in Kotlin. Users can sign up, browse restaurants, sort them by rating, open a restaurant's menu, add dishes to a cart, and save favourite restaurants for offline viewing.

I built it during the **Internshala Android App Development training**, and later updated it to current Android tooling.

## Features

- **Authentication:** register, log in, forgot password, and reset password with an OTP. The session is saved, so users stay logged in.
- **Restaurant list:** names, ratings, cost for one, and images, with sorting by rating.
- **Restaurant menu:** add dishes to or remove them from the cart.
- **Favourites:** mark restaurants as favourites. They're saved in a local Room database and viewable offline.
- **Navigation drawer:** Home, Profile, Favourites, Order History, FAQs, and Log out.
- **User profile:** shows the logged-in user's details.

## Tech stack

| Area | Used |
|---|---|
| Language | Kotlin 2.4 |
| UI | Android Views, AppCompat, Material Components, RecyclerView, DrawerLayout |
| Networking | Volley (JSON REST API) |
| Local storage | Room (with KSP), SharedPreferences |
| Images | Picasso |
| Build | Gradle 9.9, Android Gradle Plugin 9.3, JDK 25 |
| SDK | minSdk 23, targetSdk / compileSdk 37 |

## Getting started

1. Install a recent **Android Studio** (it bundles JDK 25, which this project uses).
2. Clone the repository and open the folder in Android Studio.
3. Let Gradle sync, then run the `app` configuration on an emulator or device (Android 6.0+).

To build from the command line:

```bash
./gradlew assembleDebug
```

The APK is written to `app/build/outputs/apk/debug/`.

## Project structure

```
app/src/main/java/com/rks369/foodrunner/
├── activity/   Splash, Login, Register, Forgot/Reset password, Dashboard, Restaurant menu, Cart
├── fragment/   Home, Favourites, Profile, Order history, FAQs
├── Adapter/    RecyclerView adapters for restaurants and menu items
├── database/   Room database, entities and DAOs (favourites, cart items)
├── model/      Data classes
└── util/       Connectivity check, session, edge-to-edge helper
```

## License

This is a personal learning project. Feel free to browse the code for reference.
