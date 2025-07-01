DESCRIPTION = "Control software for usb-sd-mux that switches a SD-Card between a Device Under Test (DUT) and a host PC."
HOMEPAGE = "https://github.com/linux-automation/usbsdmux"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = " \
    git://github.com/linux-automation/usbsdmux.git;protocol=https;branch=master \
    "

SRCREV = "89e93df939a19bab0fa980e914ed39f33afa2785"

DEPENDS += "python3-setuptools-scm-native"

inherit setuptools3

do_install:append() {
    install -D -m0644 ${S}/contrib/udev/99-usbsdmux.rules ${D}${sysconfdir}/udev/rules.d/99-usbsdmux.rules
}

FILES:${PN} += "${sysconfdir}"
