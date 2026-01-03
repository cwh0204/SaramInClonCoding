export default function Button({ children, className = "", ...props }) {
  return (
    <button
      {...props}
      className={`
        h-[48px]
        px-[20px]
        rounded-[8px]
        bg-[#ff5a5f]
        text-white
        text-[15px]
        font-bold
        tracking-[-0.3px]
        hover:bg-[#e94b50]
        transition
        ${className}
      `}
    >
      {children}
    </button>
  );
}
