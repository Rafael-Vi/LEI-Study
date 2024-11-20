import '../style.css'
import * as THREE from 'three';

const scene = new THREE.Scene();
const camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);

const renderer = new THREE.WebGLRenderer();
renderer.setSize(window.innerWidth, window.innerHeight);
document.getElementById('carrousel_3D').appendChild(renderer.domElement);

const material = new THREE.LineBasicMaterial({ color: 'aqua' });
let geometry = new THREE.CircleGeometry(6, 1000);
const positions = geometry.attributes.position.array;

geometry = new THREE.SphereGeometry(0.5, 32, 32);

// Create multiple spheres and position them along the circle
const numSpheres = 8;
const radius = 6;
const spheres = [];

for (let i = 0; i < numSpheres; i++) {
    const angle = (i / numSpheres) * Math.PI * 2;
    const x = radius * Math.cos(angle);
    const z = radius * Math.sin(angle);

    // Generate a random color
    const randomColor = Math.floor(Math.random() * 16777215).toString(16);
    const sphereMaterial = new THREE.MeshBasicMaterial({ color: `#${randomColor}` });

    const sphere = new THREE.Mesh(geometry, sphereMaterial);
    sphere.position.set(x, 0, z);
    spheres.push(sphere);
}

const orbit = new THREE.Group();
spheres.forEach(sphere => orbit.add(sphere));
scene.add(orbit);

camera.position.set(0, 10, 10); // Position the camera higher and further back
camera.lookAt(0, 0, 0); // Make the camera look at the center of the scene

orbit.rotation.x = -Math.PI / 6; // Angle the orbit slightly down

let targetRotation = 0;
let currentRotation = 0;
let rotationComplete = true;

function animate() {
    requestAnimationFrame(animate);

    // Smoothly rotate the orbit group
    if (Math.abs(targetRotation - currentRotation) > 0.01) {
        currentRotation += (targetRotation - currentRotation) * 0.2;
        orbit.rotation.y = currentRotation;
        rotationComplete = false;
    } else {
        rotationComplete = true;
    }

    renderer.render(scene, camera);
}

// Function to rotate the orbit group to the right
function rotateRight() {
    const angle = (2 * Math.PI) / numSpheres;
    targetRotation -= angle;
    if (rotationComplete) {
        console.log('Rotation complete');
        makeEmPop();
    }
}

// Function to rotate the orbit group to the left
function rotateLeft() {
    const angle = (2 * Math.PI) / numSpheres;
    targetRotation += angle;
    if (rotationComplete) {
        console.log('Rotation complete');
        makeEmPop();
    }
}

// Function to find and change the color of the closest sphere to the camera
function makeEmPop() {
    let minDistance = Infinity;
    let closestSphere = null;

    // Find the closest sphere to the camera
    for (const sphere of spheres) {
        const distance = camera.position.distanceTo(sphere.getWorldPosition(new THREE.Vector3()));
        if (distance < minDistance) {
            minDistance = distance;
            closestSphere = sphere;
        }
    }

    if (closestSphere) {
        console.log('Closest sphere:', closestSphere);

        // Change the color of the closest sphere
        closestSphere.material.color.set('red');
    }
}

// Add event listeners for carousel buttons
document.getElementById('button-before-carrousel').addEventListener('click', rotateLeft);
document.getElementById('button-after-carrousel').addEventListener('click', rotateRight);

// Start the animation loop
animate();

// Handle window resize
window.addEventListener('resize', () => {
    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();
    renderer.setSize(window.innerWidth, window.innerHeight);
});

console.log('Spheres positions:', spheres.map(sphere => sphere.position));
console.log('Camera position:', camera.position);