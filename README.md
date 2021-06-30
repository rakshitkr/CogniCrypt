# CogniCrypt

CogniCrypt is an Eclipse plugin that supports Java developers in using cryptographic APIs. It supports developers in two ways. First, it may generate code snippets for a number of programming tasks that involve cryptography, e.g., communication over a secure channel, data encryption, and long-term archiving. Second, it continuously runs a suite of static analyses in the background that check the  developer's code for misuses of cryptographic APIs.

## Installation

To set up CogniCrypt in your own Eclipse, please install it from the [**Update Site**](https://download.eclipse.org/cognicrypt/stable). If it is your first time using CogniCrypt, we recommend you to browse [Eclipse website](https://www.eclipse.org/cognicrypt/) and check out the [**tutorial**](https://github.com/CROSSINGTUD/CogniCrypt/wiki/Tutorial) in this project's wiki. Nightly builds of CogniCrypt are also [available](https://download.eclipse.org/cognicrypt/snapshot).


## Contribution

Cryptography experts may contribute in two ways. Experts who design and implement cryptographic algorithms can integrate those into CogniCrypt. CogniCrypt does not expose these algorithms directly but through its tasks. Experts who are providing more high-level security solutions may integrate those as well into CogniCrypt. These will be made available to CogniCrypt's user directly as new tasks. Please refer to the [contributors documentation](https://www.eclipse.org/cognicrypt/contributing/) for more detail.
